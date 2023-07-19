import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class402 extends class407 {
	@ObfuscatedName("aw")
	ArrayList field4515;

	@ObfuscatedSignature(
		descriptor = "(Lpp;Ljava/util/ArrayList;)V"
	)
	public class402(class407 var1, ArrayList var2) {
		super(var1);
		super.field4528 = "ClearRequestTask";
		this.field4515 = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		if (this.field4515.isEmpty()) {
			return true;
		} else {
			Iterator var2 = this.field4515.iterator();

			while (var2.hasNext()) {
				class318 var3 = (class318)var2.next();

				try {
					if (class306.field3394.contains(var3)) {
						if (var3 == null) {
							class306.field3394.remove(var3);
						} else {
							--var3.field3516.field3439;
							if (var3.field3516.field3439 == 0) {
								var3.field3516.clear();
								var3.field3516.method5820();
								var3.field3516.setPcmStreamVolume(0);
							}

							FloorOverlayDefinition.method4061(var3.field3507, var3.field3509);
							class306.field3394.remove(var3);
						}
					}
				} catch (Exception var5) {
					var5.printStackTrace();
					this.method7653(var5.getMessage());
					class306.field3394.clear();
					return true;
				}
			}

			return true;
		}
	}
}
