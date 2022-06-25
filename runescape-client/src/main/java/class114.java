import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("dl")
public class class114 {
	@ObfuscatedName("f")
	public static final float field1429;

	@ObfuscatedName("j")
	public static final float field1432;

	static {
		field1429 = Math.ulp(1.0F);
		field1432 = 2.0F * field1429;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llh;Llh;ZLmt;I)V", garbageValue = "1005410507")
	public static void method2636(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		UserComparator4.ItemDefinition_archive = var0;
		ItemComposition.ItemDefinition_modelArchive = var1;
		DevicePcmPlayerProvider.ItemDefinition_inMembersWorld = var2;
		PacketBufferNode.ItemDefinition_fileCount = UserComparator4.ItemDefinition_archive.getGroupFileCount(10);
		ItemComposition.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;B)Z", garbageValue = "-111")
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		int var5 = var0.length();
		int var6 = 0;
		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3;
				break;
			}
			label84 : {
				char var7 = var0.charAt(var6);
				if (var6 == 0) {
					if (var7 == '-') {
						var2 = true;
						break label84;
					}
					if (var7 == '+') {
						break label84;
					}
				}
				int var9;
				if (var7 >= '0' && var7 <= '9') {
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') {
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') {
						var1 = false;
						break;
					}
					var9 = var7 - 'W';
				}
				if (var9 >= 10) {
					var1 = false;
					break;
				}
				if (var2) {
					var9 = -var9;
				}
				int var8 = var4 * 10 + var9;
				if (var4 != var8 / 10) {
					var1 = false;
					break;
				}
				var4 = var8;
				var3 = true;
			}
			++var6;
		} 
		return var1;
	}
}