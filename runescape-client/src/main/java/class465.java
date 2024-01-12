import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public final class class465 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lro;"
	)
	public static class465[] field4800;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1215965483
	)
	static int field4806;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1786022381
	)
	public static int field4801;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	static IndexedSprite field4805;
	@ObfuscatedName("aj")
	float field4802;
	@ObfuscatedName("aq")
	float field4803;
	@ObfuscatedName("ar")
	float field4804;
	@ObfuscatedName("ag")
	float field4799;

	static {
		field4800 = new class465[0];
		field4806 = 100;
		field4800 = new class465[100];
		field4801 = 0;
		new class465();
	}

	public class465() {
		this.method8515();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-828249912"
	)
	public void method8533() {
		synchronized(field4800) {
			if (field4801 < field4806 - 1) {
				field4800[++field4801 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-850756611"
	)
	void method8513(float var1, float var2, float var3, float var4) {
		this.field4802 = var1;
		this.field4803 = var2;
		this.field4804 = var3;
		this.field4799 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFFS)V",
		garbageValue = "22207"
	)
	public void method8514(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4));
		float var6 = (float)Math.cos((double)(0.5F * var4));
		this.field4802 = var1 * var5;
		this.field4803 = var2 * var5;
		this.field4804 = var3 * var5;
		this.field4799 = var6;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "108412511"
	)
	public final void method8515() {
		this.field4804 = 0.0F;
		this.field4803 = 0.0F;
		this.field4802 = 0.0F;
		this.field4799 = 1.0F;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lro;I)V",
		garbageValue = "574450724"
	)
	public final void method8531(class465 var1) {
		this.method8513(var1.field4803 * this.field4804 + this.field4802 * var1.field4799 + var1.field4802 * this.field4799 - var1.field4804 * this.field4803, var1.field4804 * this.field4802 + this.field4799 * var1.field4803 + (this.field4803 * var1.field4799 - this.field4804 * var1.field4802), var1.field4804 * this.field4799 + (var1.field4802 * this.field4803 + this.field4804 * var1.field4799 - var1.field4803 * this.field4802), var1.field4799 * this.field4799 - this.field4802 * var1.field4802 - var1.field4803 * this.field4803 - var1.field4804 * this.field4804);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = 31.0F * var2 + this.field4802;
		var2 = this.field4803 + var2 * 31.0F;
		var2 = this.field4804 + 31.0F * var2;
		var2 = this.field4799 + var2 * 31.0F;
		return (int)var2;
	}

	public String toString() {
		return this.field4802 + "," + this.field4803 + "," + this.field4804 + "," + this.field4799;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class465)) {
			return false;
		} else {
			class465 var2 = (class465)var1;
			return this.field4802 == var2.field4802 && this.field4803 == var2.field4803 && var2.field4804 == this.field4804 && var2.field4799 == this.field4799;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lch;I)V",
		garbageValue = "-1578586943"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != class507.ItemDefinition_inMembersWorld) {
				ItemComposition.ItemDefinition_cached.clear();
				ItemComposition.ItemDefinition_cachedModels.clear();
				ItemComposition.ItemDefinition_cachedSprites.clear();
				class507.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			Archive var3 = HttpRequestTask.archive8;
			int var2 = var0.properties;
			if ((var2 & class526.field5163.rsOrdinal()) != 0) {
				GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", "");
			} else if ((var2 & class526.field5164.rsOrdinal()) != 0) {
				GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", "");
			} else if ((var2 & class526.field5142.rsOrdinal()) != 0) {
				GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var3, "logo_speedrunning", "");
			} else {
				GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var3, "logo", "");
			}
		}

		InvDefinition.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		WorldMapCacheName.field2676 = var0.field821;
		SecureRandomCallable.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		AsyncRestClient.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		GrandExchangeOfferOwnWorldComparator.currentPort = SecureRandomCallable.worldPort;
	}
}
