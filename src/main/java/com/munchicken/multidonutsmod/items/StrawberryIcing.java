package com.munchicken.multidonutsmod.items;

import com.munchicken.multidonutsmod.creativetabs.ModCreativeTabs;
import com.munchicken.multidonutsmod.help.Reference;
import net.minecraft.item.ItemFood;

/**
 * Created by Munchicken on 8/13/2017.
 */
public class StrawberryIcing extends ItemFood {

    public StrawberryIcing() {
        super(2, 0.1f, true);
        setUnlocalizedName("StrawberryIcing");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5).toLowerCase());
        setCreativeTab(ModCreativeTabs.tabDonut);
    }
}
