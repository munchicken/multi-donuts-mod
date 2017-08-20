package com.munchicken.multidonutsmod.items;

import com.munchicken.multidonutsmod.creativetabs.ModCreativeTabs;
import com.munchicken.multidonutsmod.help.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import static org.apache.commons.lang3.StringUtils.capitalize;

public class Donut extends ItemFood{

    private PotionEffect[] effects = new PotionEffect[1];
    public enum Icing {
        NONE, STRAWBERRY, CHOCOLATE, BLUEBERRY, VANILLA
    }
    public enum Sprinkle {
        NONE, GREEN, BLUE, RED, YELLOW, ORANGE, RAINBOW
    }
    public enum Fill {
        NONE, STRAWBERRY, CHOCOLATE, VANILLA, COOKIE, BROWNIE
    }
    private IIcon donutIcon;
    private IIcon icingOverlay;
    private IIcon sprinkleOverlay;
    private IIcon fillOverlay;
    private Icing icing;
    private Sprinkle sprinkle;
    private Fill filling;

    public Donut(Icing ice, Sprinkle sprink, Fill f) {

        super(2, 0.1f, false);
        icing = ice;
        sprinkle = sprink;
        filling = f;
        setUnlocalizedName(capitalize(getIcing()) + capitalize(getSprinkle()) + capitalize(getFilling()) + "Donut");
        //setUnlocalizedName("Donut");
        //setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5).toLowerCase());
        setCreativeTab(ModCreativeTabs.tabDonut);
        effects[0] = new PotionEffect(Potion.moveSpeed.id, 1200,1);
        this.setAlwaysEdible();
    }
    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onFoodEaten(stack, world, player);
        for (int i = 0; i < this.effects.length; i++)
            if (!world.isRemote && this.effects[i] != null && this.effects[i].getPotionID() > 0)
                player.addPotionEffect(new PotionEffect(this.effects[i].getPotionID(), this.effects[i].getDuration(), this.effects[i].getAmplifier(), this.effects[i].getIsAmbient()));
    }
    private String getIcing() {
        switch (icing) {
            case NONE:
                return "";
            case STRAWBERRY:
                return "strawberry";
            case CHOCOLATE:
                return "chocolate";
            case BLUEBERRY:
                return "blueberry";
            case VANILLA:
                return "vanilla";
            default:
                return "";
        }
    }
    private String getSprinkle() {
        switch (sprinkle) {
            case NONE:
                return "";
            case GREEN:
                return "green";
            case BLUE:
                return "blue";
            case RED:
                return "red";
            case YELLOW:
                return "yellow";
            case ORANGE:
                return "orange";
            case RAINBOW:
                return "rainbow";
            default:
                return "";
        }
    }
    private String getFilling() {
        switch (filling) {
            case NONE:
                return "";
            case STRAWBERRY:
                return "strawberry";
            case CHOCOLATE:
                return "chocolate";
            case VANILLA:
                return "vanilla";
            case COOKIE:
                return "cookiedough";
            case BROWNIE:
                return "browniebatter";
            default:
                return "";
        }
    }
    @Override
    public IIcon getIconFromDamageForRenderPass(int damage, int pass) {
        switch (pass) {
            case 0:
                return this.donutIcon;
            case 1:
                return this.icingOverlay;
            case 2:
                return this.sprinkleOverlay;
            case 3:
                return this.fillOverlay;
            default:
                return super.getIconFromDamageForRenderPass(damage,pass);
        }
    }
    @SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses() {
        return true;
    }
    @Override
    public void registerIcons(IIconRegister i) {
        this.donutIcon = i.registerIcon(Reference.MODID + ":" + "cookeddonut");
        if (!(getIcing().isEmpty())) { this.icingOverlay = i.registerIcon(Reference.MODID + ":" + getIcing() + "icingoverlay"); }
        if (!(getSprinkle().isEmpty())) { this.sprinkleOverlay = i.registerIcon(Reference.MODID + ":" + getSprinkle() + "sprinklesoverlay"); }
        if (!(getFilling().isEmpty())) { this.fillOverlay = i.registerIcon(Reference.MODID + ":" + getFilling() + "fillingoverlay"); }
    }
    @Override
    public int getRenderPasses(int meta) {
        int passes = 1;
        if (!(getIcing().isEmpty())) { passes++; }
        if (!(getSprinkle().isEmpty())) { passes++; }
        if (!(getFilling().isEmpty())) { passes++; }
        return passes;
    }
}
