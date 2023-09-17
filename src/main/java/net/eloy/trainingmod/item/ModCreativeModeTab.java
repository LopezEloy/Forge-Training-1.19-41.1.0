package net.eloy.trainingmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TRAINING_TAB = new CreativeModeTab("trainingtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Macaroni.get());
        }
    };

//    public static final CreativeModeTab TRAINING_TAB_2 = new CreativeModeTab("trainingtab_2") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(ModItems.Raw_Macaroni.get());
//        }
//    };
}
