package com.example.voteapp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class VotingApp extends Application {

    ObservableList<Option> optionList = FXCollections.observableArrayList();
    ObservableList<PieChart.Data> chartData = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) {

        Label lbl1 = new Label("1. พิมพ์ชื่อตัวเลือกที่ต้องการเพิ่ม:");
        TextField nameInput = new TextField();
        Button addBtn = new Button("เพิ่มตัวเลือก");
        HBox addBox = new HBox(10, nameInput, addBtn);

        Label lbl2 = new Label("2. เลือกรายการที่จะโหวต:");
        ComboBox<String> comboBox = new ComboBox<>();
        Button voteBtn = new Button("กดยืนยันโหวต");
        HBox voteBox = new HBox(10, comboBox, voteBtn);

        TableView<Option> table = new TableView<>();
        table.setItems(optionList);

        TableColumn<Option, String> nameCol = new TableColumn<>("ชื่อตัวเลือก");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        nameCol.setMinWidth(150);

        TableColumn<Option, Integer> voteCol = new TableColumn<>("คะแนน");
        voteCol.setCellValueFactory(new PropertyValueFactory<>("votes"));
        voteCol.setMinWidth(100);

        table.getColumns().add(nameCol);
        table.getColumns().add(voteCol);

        PieChart pieChart = new PieChart(chartData);
        pieChart.setPrefSize(300, 300);

        HBox resultBox = new HBox(20, table, pieChart);

        Button resetBtn = new Button("รีเซ็ตคะแนนทั้งหมดเป็น 0");

        VBox root = new VBox(15, lbl1, addBox, lbl2, voteBox, resultBox, resetBtn);
        root.setPadding(new Insets(20));


        addBtn.setOnAction(e -> {
            String newName = nameInput.getText();

            if (!newName.isEmpty()) {
                boolean isDuplicate = false;
                for (Option opt : optionList) {
                    if (opt.getName().equals(newName)) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    showAlert("ชื่อซ้ำ กรุณาพิมพ์ใหม่");
                } else {
                    optionList.add(new Option(newName));
                    comboBox.getItems().add(newName);
                    chartData.add(new PieChart.Data(newName, 0));
                    nameInput.clear();
                }
            }
        });

        voteBtn.setOnAction(e -> {
            String selected = comboBox.getValue();

            if (selected != null) {
                for (Option opt : optionList) {
                    if (opt.getName().equals(selected)) {
                        opt.addVote();
                    }
                }
                table.refresh();

                for (PieChart.Data data : chartData) {
                    if (data.getName().equals(selected)) {
                        data.setPieValue(data.getPieValue() + 1);
                    }
                }
            } else {
                showAlert("กรุณาเลือกตัวเลือกก่อนโหวต");
            }
        });

        resetBtn.setOnAction(e -> {
            for (Option opt : optionList) {
                opt.resetVotes();
            }
            for (PieChart.Data data : chartData) {
                data.setPieValue(0);
            }
            table.refresh();
        });

        Scene scene = new Scene(root, 600, 550);
        primaryStage.setTitle("Voting App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }
}
