package com.example.voteapp;

public class Option {
    private final String name;
    private int votes;

    public Option(String name) {
        this.name = name;
        this.votes = 0; // เริ่มต้นที่ 0 โหวตเสมอ
    }

    public String getName() { return name; }
    public int getVotes() { return votes; }

    // เมธอดสำหรับเพิ่มคะแนนโหวต
    public void addVote() { this.votes++; }

    // เมธอดสำหรับรีเซ็ตคะแนน
    public void resetVotes() { this.votes = 0; }
}