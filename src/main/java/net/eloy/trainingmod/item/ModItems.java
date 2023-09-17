package net.eloy.trainingmod.item;

import net.eloy.trainingmod.TrainingMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.event.InputEvent;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TrainingMod.MOD_ID);

    public static final RegistryObject<Item> Macaroni = ITEMS.register("macaroni",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TRAINING_TAB)));
    public static final RegistryObject<Item> Raw_Macaroni = ITEMS.register("raw_macaroni",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TRAINING_TAB)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
