package com.munchicken.multidonutsmod.items;

import com.munchicken.multidonutsmod.help.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ModItems {

    //public static ItemFood donut;
    public static ItemFood strawberryYellowBrownieDonut;
    public static ItemFood noneNoneNoneDonut;
    public static Item dough;
    public static Item rollingPin;
    public static Item flatDough;
    public static Item cutter;
    public static Item rawDonut;
    public static Item cookedDonut;
    public static Item pastryBag;
    public static ItemFood strawberry;
    public static ItemFood blueberry;
    public static Item vanillaBean;
    public static Item shaker;
    public static ItemFood strawberryIcing;
    public static ItemFood chocolateIcing;
    public static ItemFood blueberryIcing;
    public static ItemFood vanillaIcing;
    public static ItemFood greenSprinkles;
    public static ItemFood blueSprinkles;
    public static ItemFood redSprinkles;
    public static ItemFood yellowSprinkles;
    public static ItemFood orangeSprinkles;
    public static ItemFood rainbowSprinkles;
    public static ItemFood strawberryFilling;
    public static ItemFood chocolateFilling;
    public static ItemFood vanillaFilling;

    public static void loadItems(){

        //donut = new Donut();
        //RegisterHelper.registerItem(donut);

        strawberryYellowBrownieDonut = new Donut(Donut.Icing.STRAWBERRY,Donut.Sprinkle.YELLOW, Donut.Fill.BROWNIE);
        RegisterHelper.registerItem(strawberryYellowBrownieDonut);

        noneNoneNoneDonut = new Donut(Donut.Icing.NONE,Donut.Sprinkle.NONE, Donut.Fill.NONE);
        RegisterHelper.registerItem(noneNoneNoneDonut);

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

        blueberry = new Blueberry();
        RegisterHelper.registerItem(blueberry);

        vanillaBean = new VanillaBean();
        RegisterHelper.registerItem(vanillaBean);

        shaker = new Shaker();
        RegisterHelper.registerItem(shaker);

        strawberryIcing = new StrawberryIcing();
        RegisterHelper.registerItem(strawberryIcing);

        chocolateIcing = new ChocolateIcing();
        RegisterHelper.registerItem(chocolateIcing);

        blueberryIcing = new BlueberryIcing();
        RegisterHelper.registerItem(blueberryIcing);

        vanillaIcing = new VanillaIcing();
        RegisterHelper.registerItem(vanillaIcing);

        greenSprinkles = new GreenSprinkles();
        RegisterHelper.registerItem(greenSprinkles);

        blueSprinkles = new BlueSprinkles();
        RegisterHelper.registerItem(blueSprinkles);

        redSprinkles = new RedSprinkles();
        RegisterHelper.registerItem(redSprinkles);

        yellowSprinkles = new YellowSprinkles();
        RegisterHelper.registerItem(yellowSprinkles);

        orangeSprinkles = new OrangeSprinkles();
        RegisterHelper.registerItem(orangeSprinkles);

        rainbowSprinkles = new RainbowSprinkles();
        RegisterHelper.registerItem(rainbowSprinkles);

        strawberryFilling = new StrawberryFilling();
        RegisterHelper.registerItem(strawberryFilling);

        chocolateFilling = new ChocolateFilling();
        RegisterHelper.registerItem(chocolateFilling);

        vanillaFilling = new VanillaFilling();
        RegisterHelper.registerItem(vanillaFilling);
    }
}
