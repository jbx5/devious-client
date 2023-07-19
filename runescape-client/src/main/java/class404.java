import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public class class404 extends class407 {
	@ObfuscatedSignature(
		descriptor = "(Lpp;)V"
	)
	public class404(class407 var1) {
		super(var1);
		super.field4528 = "StartSongTask";
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		Iterator var2 = class306.field3394.iterator();

		while (var2.hasNext()) {
			class318 var3 = (class318)var2.next();
			if (var3 != null && !var3.field3508 && var3.field3516 != null) {
				try {
					var3.field3516.method5819();
					var3.field3516.setPcmStreamVolume(0);
					if (var3.field3518 != null) {
						var3.field3516.setMusicTrack(var3.field3518, var3.field3512);
					}

					var3.field3518 = null;
					var3.field3517 = null;
					var3.field3514 = null;
					var3.field3508 = true;
				} catch (Exception var5) {
					var5.printStackTrace();
					this.method7653(var5.getMessage());
					return true;
				}
			}
		}

		super.field4526 = true;
		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "108"
	)
	public static void method7637(AbstractArchive var0) {
		DbTableType.field5043 = var0;
	}
}
