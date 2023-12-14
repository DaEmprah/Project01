package com.example.project01;

public class Weapon {
    private String name;
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

    public Weapon(String name, int cost, int size, String ammoType, int damage, int rateOfFire, String weaponCapacity, int reloadSpeed, int effectiveRange, int handling, int muzzleVelocity, int meleeDamage, int heavyDamage){
        this.name = name;
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
        this.name = null;
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

    public String getName() {
        return name;
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
        return("The " + getName() + " costs " + getCost() + " hunt dollars and is a " + getSize() + " slot weapon, \nit has " + getAmmoType() + " , dealing up to " + getDamage() + " damage per upper body shot at 10 meters, \nwith a fire rate of " + getRateOfFire() + "rpm. \nThe reload takes " + getReloadSpeed() + " seconds, with a magazine size of " + getWeaponCapacity() + ". \nThe effective headshot one-shot range is up to " + getEffectiveRange() + "m. \nIts bullet velocity is " + getMuzzleVelocity() + "m/s. \nIts handling stat is " + getHandling() + "%. \nA light melee attack does " + getMeleeDamage() + " damage, \nwith a heavy attack doing " + getHeavyDamage() + " damage to the upper chest.");
    }
}
