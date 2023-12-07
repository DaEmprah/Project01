package com.example.project01;

public class Weapon {
    private int cost;
    private int size;
    private String ammoType;
    private int damage;
    private int rateOfFire;
    private String weaponCapacity;
    private int reloadSpeed;
    private int effectiveRange;
    private int handling;
    private int muzzleVelocity;
    private int meleeDamage;
    private int heavyDamage;

    public Weapon(int cost, int size, String ammoType, int damage, int rateOfFire, String weaponCapacity, int reloadSpeed, int effectiveRange, int handling, int muzzleVelocity, int meleeDamage, int heavyDamage){
        this.cost = cost;
        this.size = size;
        this.ammoType = ammoType;
        this.damage = damage;
        this.rateOfFire = rateOfFire;
        this.weaponCapacity = weaponCapacity;
        this.reloadSpeed = reloadSpeed;
        this.effectiveRange = effectiveRange;
        this.handling = handling;
        this.muzzleVelocity = muzzleVelocity;
        this.meleeDamage = meleeDamage;
        this.heavyDamage = heavyDamage;

    }
    public Weapon(){
        this.cost = 0;
        this.size = 1;
        this.ammoType = null;
        this.damage = 0;
        this.rateOfFire = 0;
        this.weaponCapacity = null;
        this.reloadSpeed = 0;
        this.effectiveRange = 0;
        this.handling = 0;
        this.muzzleVelocity = 0;
        this.meleeDamage = 0;
        this.heavyDamage = 0;
    }
    public int getCost() {
        return cost;
    }

    public int getSize() {
        return size;
    }

    public String getAmmoType() {
        return ammoType;
    }

    public int getDamage() {
        return damage;
    }

    public int getRateOfFire() {
        return rateOfFire;
    }

    public String getWeaponCapacity() {
        return weaponCapacity;
    }

    public int getReloadSpeed() {
        return reloadSpeed;
    }

    public int getEffectiveRange() {
        return effectiveRange;
    }

    public int getHandling() {
        return handling;
    }

    public int getMuzzleVelocity() {
        return muzzleVelocity;
    }

    public int getMeleeDamage() {
        return meleeDamage;
    }

    public int getHeavyDamage() {
        return heavyDamage;
    }

    public String toString(){
        /*TODO*/
    }
}
