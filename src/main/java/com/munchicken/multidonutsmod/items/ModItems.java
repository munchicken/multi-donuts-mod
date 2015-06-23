package com.munchicken.multidonutsmod.items;

import com.munchicken.multidonutsmod.help.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ModItems {

    public static ItemFood donut;
    public static Item dough;

    public static void loadItems(){

        donut = new Donut().setAlwaysEdible();
        RegisterHelper.registerItem(donut);

        dough = new Dough();
        RegisterHelper.registerItem(dough);
    }
}
