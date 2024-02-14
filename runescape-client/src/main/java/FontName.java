import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tu")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	static Widget field5062;
	@ObfuscatedName("aa")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltu;",
		garbageValue = "1003881005"
	)
	public static FontName[] method9110() {
		return new FontName[]{FontName_bold12, FontName_verdana11, FontName_plain11, FontName_verdana13, FontName_plain12, FontName_verdana15};
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;B)V",
		garbageValue = "66"
	)
	public static void method9114(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)[Loo;",
		garbageValue = "28"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4341, PlayerType.field4348, PlayerType.PlayerType_ironman, PlayerType.field4340, PlayerType.field4345, PlayerType.PlayerType_normal, PlayerType.PlayerType_ultimateIronman, PlayerType.field4344, PlayerType.PlayerType_playerModerator, PlayerType.field4336, PlayerType.PlayerType_jagexModerator, PlayerType.field4349, PlayerType.field4347, PlayerType.field4343, PlayerType.field4342, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4346};
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-13732"
	)
	static void method9111() {
		if (VarpDefinition.localPlayer.x >> 7 == Client.destinationX && VarpDefinition.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1476352820"
	)
	static final int method9113() {
		return Client.menuOptionsCount - 1;
	}
}
