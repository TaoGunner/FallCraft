package today.fallout.fallcraft.entity.monster;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityAnt extends EntityMob
{
	public EntityAnt(World worldIn)
	{
		super(worldIn);
		this.setSize(1.4F, 0.9F);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(5, new EntityAIWander(this, 0.8D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(6, new EntityAILookIdle(this));

		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
	}

	@Override
	public void onDeath(DamageSource cause) {}

	@Override
	protected SoundEvent getAmbientSound()
	{
		return SoundEvents.ENTITY_SPIDER_AMBIENT;
	}

	@Override
	protected SoundEvent getHurtSound()
	{
		return SoundEvents.ENTITY_SPIDER_HURT;
	}

	@Override
	protected SoundEvent getDeathSound()
	{
		return SoundEvents.ENTITY_SPIDER_DEATH;
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn)
	{
		this.playSound(SoundEvents.ENTITY_SPIDER_STEP, 0.15F, 1.0F);
	}
}
