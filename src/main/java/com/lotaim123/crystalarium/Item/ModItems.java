package com.lotaim123.crystalarium.Item;

import com.lotaim123.crystalarium.CrystalariumMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CrystalariumMod.MODID);

    public static final DeferredItem<Item> REFINED_AMETHYST = ITEMS.register("refined_amethyst",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
