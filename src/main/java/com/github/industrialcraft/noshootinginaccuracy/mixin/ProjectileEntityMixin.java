package com.github.industrialcraft.noshootinginaccuracy.mixin;

import net.minecraft.entity.projectile.ProjectileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ProjectileEntity.class)
public class ProjectileEntityMixin {
    @ModifyVariable(at = @At("HEAD"),method = "setVelocity(Lnet/minecraft/entity/Entity;FFFFF)V", ordinal = 4)
    private float modifyDivergence1(float divergence){
        return 0f;
    }
    @ModifyVariable(at = @At("HEAD"),method = "setVelocity(DDDFF)V", ordinal = 1)
    private float modifyDivergence2(float divergence){
        return 0f;
    }
}
