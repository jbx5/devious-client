import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
public class class405 extends class407 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	class318 field4520;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2025464221
	)
	int field4521;

	@ObfuscatedSignature(
		descriptor = "(Lpp;IZI)V"
	)
	public class405(class407 var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4520 = null;
		this.field4521 = 0;
		super.field4528 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class306.field3396.size()) {
				this.field4520 = (class318)class306.field3396.get(var2);
			} else if (!var3 && var2 < class306.field3394.size()) {
				this.field4520 = (class318)class306.field3394.get(var2);
			}

			this.field4521 = var4;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		if (this.field4520 != null && this.field4520.field3516 != null) {
			this.field4520.field3515 = true;

			try {
				if (this.field4520.field3511 > 0.0F && this.field4520.field3516.isReady()) {
					float var2 = this.field4521 == 0 ? (float)this.field4521 : (float)this.field4520.field3510 / (float)this.field4521;
					class318 var10000 = this.field4520;
					var10000.field3511 -= 0.0F == var2 ? (float)this.field4520.field3510 : var2;
					if (this.field4520.field3511 < 0.0F) {
						this.field4520.field3511 = 0.0F;
					}

					this.field4520.field3516.setPcmStreamVolume((int)this.field4520.field3511);
					return false;
				}
			} catch (Exception var4) {
				this.method7653(var4.getMessage());
				return true;
			}

			this.field4520.field3515 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1708215021"
	)
	public static void method7642() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lig;IIII)V",
		garbageValue = "1446109595"
	)
	static void method7643(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class150.clientPreferences.method2481() != 0) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				SoundSystem.method853(var0.soundEffects[var1], var2, var3);
			}
		}
	}
}
