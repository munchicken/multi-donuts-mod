package com.munchicken.multidonutsmod.items;

import com.munchicken.multidonutsmod.help.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ModItems {

    public static ItemFood donut;
    public static Item dough;
    public static Item rollingPin;
    public static Item flatDough;
    public static Item cutter;

    public static void loadItems(){

        donut = new Donut().setAlwaysEdible();
        RegisterHelper.registerItem(donut);

        dough = new Dough();
        RegisterHelper.registerItem(dough);

        rollingPin = new RollingPin();
        RegisterHelper.registerItem(rollingPin);

        flatDough = new FlatDough();
        RegisterHelper.registerItem(flatDough);

        cutter = new Cutter();
        RegisterHelper.registerItem(cutter);
    }
}
