package com.company;

import com.company.weapons.*;

public class Player {
    public Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Gun(),
                new MachineGun(),
                new Slingshot(),
                new WaterPistol()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void weaponSay(int numberOfSlot) {
        if (numberOfSlot > 0 && numberOfSlot <= getSlotsCount()) {
            Weapon weapon = weaponSlots[numberOfSlot - 1];
            System.out.println(weapon.getClass().getSimpleName());
            weapon.shot();
        } else {
            System.out.println("Такого оружия нет");
        }


    }
}
