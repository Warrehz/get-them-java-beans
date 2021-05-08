package com.learning.inheritance;

public class Passenger implements Comparable<Passenger> {
    private String name;

    public static class RewardProgram {
        private int memberLevel; // 3 (first priority), 2, 1
        private int memberDays;

        public void setMemberLevel(int memberLevel) {
            this.memberLevel = memberLevel;
        }

        public int getMemberLevel() {
            return memberLevel;
        }

        public void setMemberDays(int memberDays) {
            this.memberDays = memberDays;
        }

        public int getMemberDays() {
            return memberDays;
        }
    }

    private RewardProgram rewardProgram = new RewardProgram();

    public Passenger() {}

    public Passenger(String name) {
        this.name = name;
    }

    public Passenger(String name, int memberLevel, int memberDays) {
        this.name = name;
        rewardProgram.memberLevel = memberLevel;
        rewardProgram.memberDays = memberDays;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Passenger p) {
        int returnValue = p.rewardProgram.memberLevel - rewardProgram.memberLevel;
        return returnValue;
    }

}
