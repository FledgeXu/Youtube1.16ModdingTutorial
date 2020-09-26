package com.github.fledgexu.youtube.item;

import com.github.fledgexu.youtube.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<ObsidianIngotItem> obsidianIngot = ITEMS.register("obsidian_ingot", ObsidianIngotItem::new);
}
