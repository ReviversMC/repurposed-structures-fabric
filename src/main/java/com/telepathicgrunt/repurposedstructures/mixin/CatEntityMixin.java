package com.telepathicgrunt.repurposedstructures.mixin;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.telepathicgrunt.repurposedstructures.modinit.RSStructureTagMap;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ChunkSerializer;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.StructureFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CatEntity.class)
public class CatEntityMixin {

    /**
     * Allow witch hut cats to spawn in repurposed Structures's witch huts.
     * @author TelepathicGrunt
     */
    @Inject(method = "initialize(Lnet/minecraft/world/ServerWorldAccess;Lnet/minecraft/world/LocalDifficulty;Lnet/minecraft/entity/SpawnReason;Lnet/minecraft/entity/EntityData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/entity/EntityData;",
            at = @At(value = "TAIL"))
    private void emitMissingStructureMessage(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag, CallbackInfoReturnable<EntityData> cir){
        ServerWorld world2 = world.toServerWorld();
        BlockPos pos = ((CatEntity)(Object)this).getBlockPos();

        if (world2 != null) {
            for(StructureFeature<?> structureFeature : RSStructureTagMap.REVERSED_TAGGED_STRUCTURES.get(RSStructureTagMap.STRUCTURE_TAGS.WITCH_HUTS)){
                if (world2.getStructureAccessor().getStructureAt(pos, true, structureFeature).hasChildren()) {
                    ((CatEntity)(Object)this).setCatType(10);
                    ((CatEntity)(Object)this).setPersistent();
                    return;
                }
            }
        }
    }
}
