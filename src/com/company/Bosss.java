package com.company;

public class Bosss {
     private int BosssHealth;
     private int BosssDamage;
     private String BosssDefence;

    public Bosss(int bosssHealth, int bosssDamage,String bosssDefence) {
        BosssHealth = bosssHealth;
        BosssDamage = bosssDamage;
        BosssDefence = bosssDefence;
    }

    public void setBosssHealth(int bosssHealth) {
        BosssHealth = bosssHealth;
    }

    public void setBosssDamage(int bosssDamage) {
        BosssDamage = bosssDamage;
    }

    public void setBosssDefence(String bosssDefence) {
        BosssDefence = bosssDefence;
    }

    public int getBosssHealth() {
        return BosssHealth;
    }

    public int getBosssDamage() {
        return BosssDamage;
    }

    public String getBosssDefence() {
        return BosssDefence;
    }
}
