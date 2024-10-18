import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
public class class95 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1164;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1165;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1166;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1167;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1168;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1180;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1177;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1171;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1173;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1174;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1172;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1175;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1176;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1183;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1169;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1179;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1170;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1181;

	static {
		field1164 = new class95();
		field1165 = new class95();
		field1166 = new class95();
		field1167 = new class95();
		field1168 = new class95();
		field1180 = new class95();
		field1177 = new class95();
		field1171 = new class95();
		field1173 = new class95();
		field1174 = new class95();
		field1172 = new class95();
		field1175 = new class95();
		field1176 = new class95();
		field1183 = new class95();
		field1169 = new class95();
		field1179 = new class95();
		field1170 = new class95();
		field1181 = new class95();
	}

	class95() {
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-952795451"
	)
	static int method2662(int var0, Script var1, boolean var2) {
		if (var0 == 6809) {
			int var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			ObjectComposition var4 = UrlRequest.getObjectDefinition(var3);
			Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
			return 1;
		} else {
			return 2;
		}
	}
}
