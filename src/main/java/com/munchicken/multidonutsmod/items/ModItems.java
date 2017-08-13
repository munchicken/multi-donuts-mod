package com.munchicken.multidonutsmod.items;

import com.munchicken.multidonutsmod.help.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ModItems {

    //public static ItemFood donut;
    public static ItemFood strawberryYellowBrownieDonut;
    public static Item dough;
    public static Item rollingPin;
    public static Item flatDough;
    public static Item cutter;
    public static Item rawDonut;
    public static Item cookedDonut;
    public static Item pastryBag;
    public static Item strawberry;

    public static void loadItems(){

        //donut = new Donut();
        //RegisterHelper.registerItem(donut);

        strawberryYellowBrownieDonut = new Donut(Donut.Icing.STRAWBERRY,Donut.Sprinkle.YELLOW, Donut.Fill.BROWNIE);
        RegisterHelper.registerItem(strawberryYellowBrownieDonut);

        dough = new Dough();
        RegisterHelper.registerItem(dough);

        rollingPin = new RollingPin();
        RegisterHelper.registerItem(rollingPin);

        flatDough = new FlatDough();
        RegisterHelper.registerItem(flatDough);

        cutter = new Cutter();
        RegisterHelper.registerItem(cutter);

        rawDonut = new RawDonut();
        RegisterHelper.registerItem(rawDonut);

        cookedDonut = new CookedDonut();
        RegisterHelper.registerItem(cookedDonut);

        pastryBag = new PastryBag();
        RegisterHelper.registerItem(pastryBag);

        strawberry = new Strawberry();
        RegisterHelper.registerItem(strawberry);
    }
}
