import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3810(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3825(1, 0),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3808(2, 0),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3809(3, 0),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3811(9, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3826(4, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3812(5, 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3813(6, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3814(7, 1),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3815(8, 1),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3816(12, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3817(13, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3818(14, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3819(15, 2),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3827(16, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3821(17, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3822(18, 2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3806(19, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3824(20, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3820(21, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3829(10, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3823(11, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	field3828(22, 3);

	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -43271469
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "48"
	)
	static void method6642(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)Z",
		garbageValue = "1084852448"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
