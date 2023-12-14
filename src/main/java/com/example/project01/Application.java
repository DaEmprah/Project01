package com.example.project01;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

public class Application extends javafx.application.Application {
    public Application() throws FileNotFoundException {
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hunt weapon comparison tool!");
        stage.setScene(scene);
        stage.show();
        weaponList.add(BornheimNo3);
        weaponList.add(BornheimNo3Extended);
        weaponList.add(BornheimNo3Match);
        weaponList.add(CaldwellConversionPistol);
        weaponList.add(CaldwellConversionChainPistol);
        weaponList.add(CaldwellConversionUppercut);
        weaponList.add(CaldwellPax);
        weaponList.add(CaldwellPaxClaw);
        weaponList.add(Dolch96);
        weaponList.add(Dolch96Precision);
        weaponList.add(NagantM1895);
        weaponList.add(NagantM1895Silencer);
        weaponList.add(NagantM1895Precision);
        weaponList.add(NagantM1895Deadeye);
        weaponList.add(NagantM1895Officer);
        weaponList.add(NagantM1895OfficerBrawler);
        weaponList.add(NagantM1895OfficerCarbine);
        weaponList.add(NagantM1895OfficerCarbineDeadeye);
        weaponList.add(Springfield1866);
        weaponList.add(Springfield1866Marksman);
        weaponList.add(Springfield1866Compact);
        weaponList.add(Springfield1866CompactDeadeye);
        weaponList.add(Springfield1866CompactStriker);
        weaponList.add(Lebel1886);
        weaponList.add(Lebel1886Marksman);
        weaponList.add(Lebel1886Talon);
        weaponList.add(MartiniHenryIC1);
        weaponList.add(MartiniHenryIC1Deadeye);
        weaponList.add(MartiniHenryIC1Marksman);
        weaponList.add(MartiniHenryIC1Riposte);
        weaponList.add(MartiniHenryIC1Ironside);
        weaponList.add(SparksLRR);
        weaponList.add(SparksLRRSilencer);
        weaponList.add(SparksLRRSniper);
        weaponList.add(Vetterli71Karabiner);
        weaponList.add(Vetterli71KarabinerBayonet);
        weaponList.add(Vetterli71KarabinerDeadeye);
        weaponList.add(WinfieldM1873);
        weaponList.add(WinfieldM1873Aperture);
        weaponList.add(WinfieldM1873MusketBayonet);
        weaponList.add(WinfieldM1873Swift);
        weaponList.add(WinfieldM1873Talon);
        weaponList.add(WinfieldM1876Centennial);
        weaponList.add(WinfieldM1876CentennialSniper);
        weaponList.add(WinfieldM1873C);
        weaponList.add(WinfieldM1873CMarksman);
        weaponList.add(WinfieldM1873CSilencer);
        weaponList.add(WinfieldM1873CVandal);
        weaponList.add(WinfieldM1873CVandalStriker);
        weaponList.add(WinfieldM1873CVandalDeadeye);
        weaponList.add(MosinNagantM1891);
        weaponList.add(MosinNagantM1891Bayonet);
        weaponList.add(MosinNagantM1891Sniper);
        weaponList.add(MosinNagantM1891Avtomat);
        weaponList.add(MosinNagantM1891Obrez);
        weaponList.add(MosinNagantM1891ObrezDrum);
        weaponList.add(MosinNagantM1891ObrezMace);
        weaponList.add(Springfield1892Krag);
        weaponList.add(CaldwellRival78);
        weaponList.add(CaldwellRival78Handcannon);
        weaponList.add(Winfield1887Terminus);
        weaponList.add(Winfield1887TerminusHandcannon);
        weaponList.add(Romero77);
        weaponList.add(Romero77Talon);
        weaponList.add(Romero77Alamo);
        weaponList.add(Romero77Handcannon);
        weaponList.add(Romero77Hatchet);
        weaponList.add(Specter1882);
        weaponList.add(Specter1882Bayonet);
        weaponList.add(Specter1882Compact);
        weaponList.add(CrownAndKingAuto5);
        weaponList.add(BombLance);
        weaponList.add(NitroExpressRifle);
        weaponList.add(Crossbow);
        weaponList.add(HandCrossbow);
    }

    public static void main(String[] args) {
        launch();
    }

    static ArrayList<Weapon> weaponList = new ArrayList<>();
    Weapon BombLance = new Weapon("Bomb Lance", 199, 3, "special ammo", 150, 15, "1/5 bolts", 4, 25, 87, 60, 180, 360);
    Weapon CaldwellRival78 = new Weapon("Caldwell Rival 78", 100, 3, "shotgun shells", 175, 90, "2/8 shells", 4, 12, 87, 400, 27, 54);
    Weapon Crossbow = new Weapon("Crossbow", 50, 3, "special ammo", 260, 10, "1/18 bolts", 6, 47, 54, 150, 27, 54);
    Weapon CrownAndKingAuto5 = new Weapon("Crown & King Auto-5", 600, 3, "shotgun", 185, 100, "4+1/6 shells", 10, 12, 78, 425, 27, 54);
    Weapon Lebel1886 = new Weapon("Lebel 1886", 397, 3, "long ammo", 132, 34, "10/5 rounds", 18, 310, 83, 630, 27, 54);
    Weapon Lebel1886Marksman = new Weapon("Lebel 1886 Marksman", 437, 3, "long ammo", 132, 34, "10/5 rounds", 18, 310, 80, 630, 27, 54);
    Weapon Lebel1886Talon = new Weapon("Lebel 1886 Talon", 422, 3, "long ammo", 132, 34, "10/5 rounds", 18, 310, 81, 630, 27, 150);
    Weapon MartiniHenryIC1 = new Weapon("Martini-Henry IC1", 122, 3, "long ammo", 143, 45, "1/20 rounds", 3, 334, 70, 400, 27, 54);
    Weapon MartiniHenryIC1Deadeye = new Weapon("Martini-Henry IC1 Deadeye", 145, 3, "long ammo", 143, 45, "1/20 rounds", 3, 334, 67, 400, 27, 54);
    Weapon MartiniHenryIC1Marksman = new Weapon("Martini-Henry IC1 Marksman", 173, 3, "long ammo", 143, 45, "1/20 rounds", 3, 334, 68, 400, 27, 54);
    Weapon MartiniHenryIC1Riposte = new Weapon("Martini-Henry IC1 Riposte", 164, 3, "long ammo", 143, 45, "1/20 rounds", 3, 334, 66, 400, 82, 168);
    Weapon MartiniHenryIC1Ironside = new Weapon("Martini-Henry IC1 Ironside", 184, 3, "long ammo", 143, 33, "5+1/10 rounds", 11, 334, 68, 400, 27, 53);
    Weapon MosinNagantM1891 = new Weapon("Mosin-Nagant M1891", 490, 3, "long ammo", 136, 34, "5/10 rounds", 4, 319, 75, 615, 27, 54);
    Weapon MosinNagantM1891Avtomat = new Weapon("Mosin-Nagant M1891 Avtomat", 1250, 3, "long ammo", 136, 400, "15/0 rounds", 11, 319, 35, 615, 27, 54);
    Weapon MosinNagantM1891Bayonet = new Weapon("Mosin-Nagant M1891 Bayonet", 540, 3, "long ammo", 136, 34, "5/10 rounds", 4, 319, 70, 615, 27, 168);
    Weapon MosinNagantM1891Sniper = new Weapon("Mosin-Nagant M1891 Sniper", 550, 3, "long ammo", 136, 34, "5/10 rounds", 5, 319, 75, 615, 27, 54);
    Weapon NagantM1895OfficerCarbine = new Weapon("Nagant M1895 Officer Carbine", 155, 3, "compact ammo", 104, 120, "7/14 rounds", 12, 92, 89, 360, 27, 54);
    Weapon NagantM1895OfficerCarbineDeadeye = new Weapon("Nagant M1895 Officer Carbine Deadeye", 211, 3, "compact ammo", 104, 120, "7/14 rounds", 12, 92, 84, 360, 27, 54);
    Weapon NitroExpressRifle = new Weapon("Nitro Express Rifle", 1015, 3, "special ammo", 364, 60, "2/4 rounds", 4, 250, 41, 550, 27, 54);
    Weapon Romero77 = new Weapon("Romero 77", 66, 3, "shotgun shells", 200, 30, "1/12 shells", 3, 15, 92, 450, 27, 54);
    Weapon Romero77Alamo = new Weapon("Romero 77 Alamo", 98, 3, "shotgun shells", 218, 12, "4+1/5 shells", 18, 14, 92, 450, 27, 54);
    Weapon Romero77Talon = new Weapon("Romero 77 Talon", 84, 3, "shotgun shells", 200, 30, "1/12 shells", 3, 15, 88, 450, 27, 150);
    Weapon SparksLRR = new Weapon("Sparks LRR", 130, 3, "long ammo", 149, 38, "1/16 rounds", 4, 347, 73, 533, 27, 54);
    Weapon SparksLRRSilencer = new Weapon("Sparks LRR Silencer", 150, 3, "long ammo", 149, 38, "1/16 rounds", 4, 144, 71, 300, 27, 54);
    Weapon SparksLRRSniper = new Weapon("Sparks LRR Sniper", 199, 3, "long ammo", 149, 38, "1/16 rounds", 4, 347, 70, 533, 27, 54);
    Weapon Specter1882 = new Weapon("Specter 1882", 188, 3, "shotgun shells", 185, 40, "4+1/10 shells", 14, 12, 85, 425, 27, 54);
    Weapon Specter1882Bayonet = new Weapon("Specter 1882 Bayonet", 223, 3, "shotgun shells", 175, 40, "4+1/10 shells", 14, 12, 81, 400, 27, 168);
    Weapon Springfield1866 = new Weapon("Springfield 1866", 38, 3, "medium ammo", 132, 42, "1/24 rounds", 2, 212, 80, 490, 27, 54);
    Weapon Springfield1866Marksman = new Weapon("Springfield 1866 Marksman", 73, 3, "medium ammo", 132, 42, "1/24 rounds", 2, 212, 75, 490, 27, 54);
    Weapon Springfield1892Krag = new Weapon("Springfield 1892 Krag", 376, 3, "long ammo", 124, 43, "5+1/6 rounds", 11, 290, 81, 610, 27, 54);
    Weapon Vetterli71Karabiner = new Weapon("Vetterli 71 Karabiner", 105, 3, "medium ammo", 130, 42, "6+1/20 rounds", 12, 203, 87, 410, 27, 54);
    Weapon Vetterli71KarabinerBayonet = new Weapon("Vetterli 71 Karabiner Bayonet", 155, 3, "medium ammo", 130, 42, "6+1/20 rounds", 12, 203, 85, 410, 27, 168);
    Weapon Vetterli71KarabinerDeadeye = new Weapon("Vetterli 71 Karabiner Deadeye", 130, 3, "medium ammo", 130, 42, "6+1/20 rounds", 12, 203, 83, 410, 27, 54);
    Weapon Winfield1887Terminus = new Weapon("Winfield 1887 Terminus", 309, 3, "shotgun shells", 185, 36, "6+1/6 shells", 14, 12, 82, 425, 27, 54);
    Weapon WinfieldM1873 = new Weapon("Winfield M1873", 75, 3, "compact ammo", 110, 50, "15+1/20 rounds", 16, 95, 87, 400, 27, 54);
    Weapon WinfieldM1873Aperture = new Weapon("Winfield M1873 Aperture", 80, 3, "compact ammo", 110, 50, "15+1/20 rounds", 16, 95, 79, 400, 27, 54);
    Weapon WinfieldM1873MusketBayonet = new Weapon("Winfield M1873 Musket Bayonet", 137, 3, "compact ammo", 110, 50, "17+1/20 rounds", 18, 95, 82, 400, 27, 168);
    Weapon WinfieldM1873Swift = new Weapon("Winfield M1873 Swift", 128, 3, "compact ammo", 110, 50, "15+1/20 rounds", 8, 95, 87, 400, 27, 54);
    Weapon WinfieldM1873Talon = new Weapon("Winfield M1873 Talon", 100, 3, "compact ammo", 110, 50, "15+1/20 rounds", 16, 95, 85, 400, 27, 150);
    Weapon WinfieldM1873C = new Weapon("Winfield M1873C", 41, 3, "compact ammo", 110, 50, "7+1/28 rounds", 10, 150, 89, 400, 27, 54);
    Weapon WinfieldM1873CMarksman = new Weapon("Winfield M1873C Marksman", 56, 3, "compact ammo", 110, 50, "7+1/28 rounds", 10, 67, 83, 400, 27, 54);
    Weapon WinfieldM1873CSilencer = new Weapon("Winfield M1873C Silencer", 55, 3, "compact ammo", 110, 50, "7+1/28 rounds", 10, 135, 84, 250, 27, 54);
    Weapon WinfieldM1876Centennial = new Weapon("Winfield M1876 Centennial", 157, 3, "medium ammo", 123, 39, "9+1/12 rounds", 11, 180, 76, 600, 27, 54);
    Weapon WinfieldM1876CentennialSniper = new Weapon("Winfield M1876 Centennial Sniper", 229, 3, "medium ammo", 123, 39, "9+1/12 rounds", 11, 180, 72, 600, 27, 54);
    Weapon BornheimNo3Match = new Weapon("Bornheim No. 3 Match", 224, 2, "compact ammo", 74, 210, "5+1/10 rounds", 3, 60, 85, 400, 27, 54);
    Weapon CaldwellRival78Handcannon = new Weapon("Caldwell Rival 78 Handcannon", 85, 2, "shotgun shells", 85, 90, "2/6 shells", 4, 7, 84, 350, 13, 31);
    Weapon Dolch96Precision = new Weapon("Dolch 96 Precision", 790, 2, "special ammo", 110, 164, "10/10 rounds", 4, 86, 80, 440, 27, 54);
    Weapon MosinNagantM1891Obrez = new Weapon("Mosin-Nagant M1891 Obrez", 290, 2, "long ammo", 136, 34, "5/10 rounds", 3, 250, 71, 550, 13, 31);
    Weapon MosinNagantM1891ObrezDrum = new Weapon("Mosin-Nagant M1891 Obrez Drum", 350, 2, "long ammo", 136, 34, "15/0 rounds", 3, 250, 65, 550, 13, 31);
    Weapon MosinNagantM1891ObrezMace = new Weapon("Mosin-Nagant M1891 Obrez Mace", 310, 2, "long ammo", 136, 34, "5/10 rounds", 3, 250, 65, 550, 90, 90);
    Weapon NagantM1895Deadeye = new Weapon("Nagant M1895 Deadeye", 42, 2, "compact ammo", 91, 63, "7/21 rounds", 13, 73, 85, 330, 27, 54);
    Weapon NagantM1895Precision = new Weapon("Nagant M1895 Precision", 29, 2, "compact ammo", 91, 63, "7/21 rounds", 13, 73, 86, 330, 27, 54);
    Weapon Romero77Handcannon = new Weapon("Romero 77 Handcannon", 26, 2, "shotgun shells", 140, 30, "1/10 shells", 3, 10, 86, 375, 13, 31);
    Weapon Romero77Hatchet = new Weapon("Romero 77 Hatchet", 62, 2, "shotgun shells", 85, 30, "1/10 shells", 3, 10, 80, 375, 90, 150);
    Weapon Specter1882Compact = new Weapon("Specter 1882 Compact", 164, 2, "shotgun shells", 85, 40, "3+1/8 shells", 11, 7, 80, 350, 13, 31);
    Weapon Springfield1866Compact = new Weapon("Springfield 1866 Compact", 33, 2, "medium ammo", 132, 42, "1/24 rounds", 2, 175, 67, 440, 13, 31);
    Weapon Springfield1866CompactDeadeye = new Weapon("Springfield 1866 Compact Deadeye", 46, 2, "medium ammo", 132, 42, "1/24 rounds", 2, 175, 73, 440, 13, 31);
    Weapon Springfield1866CompactStriker = new Weapon("Springfield 1866 Compact Striker", 56, 2, "medium ammo", 132, 42, "1/24 rounds", 2, 175, 66, 440, 52, 105);
    Weapon Winfield1887TerminusHandcannon = new Weapon("Winfield 1887 Terminus Handcannon", 289, 2, "shotgun shells", 75, 36, "5+1/4 shells", 12, 7, 79, 350, 13, 31);
    Weapon WinfieldM1873CVandal = new Weapon("Winfield M1873C Vandal", 35, 2, "compact ammo", 107, 50, "7+1/28 rounds", 8, 140, 71, 370, 13, 31);
    Weapon WinfieldM1873CVandalStriker = new Weapon("Winfield M1873C Vandal Striker", 39, 2, "compact ammo", 107, 50, "7+1/28 rounds", 8, 140, 71, 370, 52, 105);
    Weapon WinfieldM1873CVandalDeadeye = new Weapon("Winfield M1873C Vandal Deadeye", 45, 2, "compact ammo", 107, 50, "7+1/28 rounds", 8, 140, 76, 370, 13, 31);
    Weapon BornheimNo3 = new Weapon("Bornheim No. 3", 201, 1, "compact ammo", 74, 210, "5+1/10 rounds", 3, 60, 64, 380, 13, 31);
    Weapon BornheimNo3Extended = new Weapon("Bornheim No. 3 Extended", 306, 1, "compact ammo", 74, 210, "8+1/10 rounds", 8, 60, 64, 380, 13, 31);
    Weapon CaldwellConversionChainPistol = new Weapon("Caldwell Conversion Chain Pistol", 50, 1, "medium ammo", 104, 44, "17/18 rounds", 28, 84, 60, 300, 13, 31);
    Weapon CaldwellConversionPistol = new Weapon("Caldwell Conversion Pistol", 26, 1, "medium ammo", 104, 44, "6/18 rounds", 11, 84, 66, 300, 13, 31);
    Weapon CaldwellConversionUppercut = new Weapon("Caldwell Conversion Uppercut", 275, 1, "long ammo", 130, 40, "6/9 rounds", 15, 96, 57, 410, 13, 31);
    Weapon CaldwellPax = new Weapon("Caldwell Pax", 100, 1, "medium ammo", 110, 46, "6/12 rounds", 11, 86, 60, 330, 13, 31);
    Weapon CaldwellPaxClaw = new Weapon("Caldwell Pax Claw", 125, 1, "medium ammo", 110, 46, "6/12 rounds", 11, 86, 60, 330, 37, 75);
    Weapon Dolch96 = new Weapon("Dolch 96", 750, 1, "special ammo", 110, 164, "10/10 rounds", 5, 86, 72, 440, 13, 31);
    Weapon HandCrossbow = new Weapon("Hand Crossbow", 35, 1, "special ammo", 195, 12, "1/12 bolts", 5, 45, 53, 100, 18, 36);
    Weapon NagantM1895 = new Weapon("Nagant M1895", 24, 1, "compact ammo", 91, 40, "7/21 rounds", 12, 73, 63, 330, 13, 31);
    Weapon NagantM1895Officer = new Weapon("Nagant M1895 Officer", 66, 1, "compact ammo", 91, 100, "7/14 rounds", 12, 73, 58, 330, 13, 31);
    Weapon NagantM1895OfficerBrawler = new Weapon("Nagant M1895 Officer Brawler", 80, 1, "compact ammo", 91, 100, "7/14 rounds", 12, 73, 58, 330, 31, 67);
    Weapon NagantM1895Silencer = new Weapon("Nagant M1895 Silencer", 53, 1, "compact ammo", 91, 40, "7/21 rounds", 12, 56, 61, 250, 13, 31);
    public static String weaponCompare(Weapon a, Weapon b){
        String costA = a.getCost() + " $";
        String costB = b.getCost() + " $";
        String sizeA = a.getSize() + " slot/s";
        String sizeB = b.getSize() + " slot/s";
        String rangedDamageA = a.getDamage() + " damage";
        String rangedDamageB = b.getDamage() + " damage";
        String rpmA = a.getRateOfFire() + " rpm";
        String rpmB = b.getRateOfFire() + " rpm";
        String reloadSpeedA = a.getReloadSpeed() + " s";
        String reloadSpeedB = b.getReloadSpeed() + " s";
        String effectiveRangeA = a.getEffectiveRange() + " m";
        String effectiveRangeB = b.getEffectiveRange() + " m";
        String handlingA = a.getHandling() + " %";
        String handlingB = b.getHandling() + " %";
        String muzzleVelocityA = a.getMuzzleVelocity() + " m/s";
        String muzzleVelocityB = b.getMuzzleVelocity() + " m/s";
        String meleeDamageA = a.getMeleeDamage() + " damage";
        String meleeDamageB = b.getMeleeDamage() + " damage";
        String heavyMeleeDamageA = a.getHeavyDamage() + " damage";
        String heavyMeleeDamageB = b.getHeavyDamage() + " damage";
        String output = String.format("""
                | Stat                 | %-36s | %-36s |
                |----------------------| ------------------------------------ | ------------------------------------ |
                | Cost                 | %-36s | %-36s |
                | Size                 | %-36s | %-36s |
                | Ammo Type            | %-36s | %-36s |
                | Damage               | %-36s | %-36s |
                | Rate of Fire         | %-36s | %-36s |
                | Ammo Capacity        | %-36s | %-36s |
                | Reload Speed         | %-36s | %-36s |
                | Effective Range      | %-36s | %-36s |
                | Handling             | %-36s | %-36s |
                | Muzzle Velocity      | %-36s | %-36s |
                | Melee Damage         | %-36s | %-36s |
                | Heavy Melee Damage   | %-36s | %-36s |
                """,
                a.getName(), b.getName(),
                costA, costB,
                sizeA, sizeB,
                a.getAmmoType(), b.getAmmoType(),
                rangedDamageA, rangedDamageB,
                rpmA, rpmB,
                a.getWeaponCapacity(), b.getWeaponCapacity(),
                reloadSpeedA, reloadSpeedB,
                effectiveRangeA, effectiveRangeB,
                handlingA, handlingB,
                muzzleVelocityA, muzzleVelocityB,
                meleeDamageA, meleeDamageB,
                heavyMeleeDamageA, heavyMeleeDamageB);
        return output;
    }
    public static void writeToFile(Weapon a){
        PrintWriter write;
        {
            try {
                write = new PrintWriter("WeaponInfo.txt");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        write.println(a.toString());
        write.close();
    }

}
/*All weapons pre-Tide of shadows event, excluding the LeMatt Mark 2, LeMatt Mark 2 Carbine and melee-only weapons*/