import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
public class class33 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1887407395
	)
	int field163;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1936284001
	)
	int field168;

	class33(int var1, int var2) {
		this.field163 = var1;
		this.field168 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbi;I)Z",
		garbageValue = "1979217570"
	)
	boolean method491(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field163) {
			case 1:
				return var1.vmethod4310(this.field168);
			case 2:
				return var1.vmethod4320(this.field168);
			case 3:
				return var1.vmethod4321((char)this.field168);
			case 4:
				return var1.vmethod4312(this.field168 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1755486935"
	)
	static int method494(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)V",
		garbageValue = "-56685834"
	)
	static void method495(NPC var0) {
		var0.field1198 = var0.definition.size;
		var0.field1240 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field1931;
		var0.field1185 = var0.definition.field1937;
		var0.field1186 = var0.definition.field1954;
		var0.field1233 = var0.definition.field1962;
		var0.field1188 = var0.definition.field1961;
		var0.field1189 = var0.definition.field1941;
		var0.field1190 = var0.definition.field1958;
		var0.field1239 = var0.definition.field1945;
	}
}
