import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class406 extends class407 {
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = 1301217535
	)
	static int field4522;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	class318 field4524;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 870968583
	)
	int field4523;

	@ObfuscatedSignature(
		descriptor = "(Lpp;IZI)V"
	)
	public class406(class407 var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4524 = null;
		this.field4523 = 0;
		super.field4528 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class306.field3396.size()) {
				this.field4524 = (class318)class306.field3396.get(var2);
			} else if (!var3 && var2 < class306.field3394.size()) {
				this.field4524 = (class318)class306.field3394.get(var2);
			}

			this.field4523 = var4;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		if (this.field4524 != null && this.field4524.field3516 != null) {
			this.field4524.field3515 = true;

			try {
				if (this.field4524.field3511 < (float)this.field4524.field3510 && this.field4524.field3516.isReady()) {
					float var2 = this.field4523 == 0 ? (float)this.field4523 : (float)this.field4524.field3510 / (float)this.field4523;
					class318 var10000 = this.field4524;
					var10000.field3511 += var2 == 0.0F ? (float)this.field4524.field3510 : var2;
					if (this.field4524.field3511 > (float)this.field4524.field3510) {
						this.field4524.field3511 = (float)this.field4524.field3510;
					}

					this.field4524.field3516.setPcmStreamVolume((int)this.field4524.field3511);
					return false;
				}
			} catch (Exception var4) {
				this.method7653(var4.getMessage());
				return true;
			}

			this.field4524.field3515 = false;
			return true;
		} else {
			return true;
		}
	}
}
