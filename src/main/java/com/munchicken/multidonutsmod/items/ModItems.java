package com.munchicken.multidonutsmod.items;

import com.munchicken.multidonutsmod.help.RegisterHelper;
import net.minecraft.item.Item;

public class ModItems {

    public static Item donut;

    public static void loadItems(){

        donut = new Donut();
        RegisterHelper.registerItem(donut);
    }
}
