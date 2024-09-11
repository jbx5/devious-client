import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -809297581
	)
	static int field1304;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1662493805
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -156689479
	)
	@Export("health")
	int health;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -428027423
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1070811061
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-611296192"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lif;",
		garbageValue = "-683358200"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-467912855"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "44"
	)
	static int method2693(int var0, Script var1, boolean var2) {
		if (var0 == 7900) {
			int var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			Client.field811 = Math.max(var3, 0);
			return 1;
		} else if (var0 == 7901) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.field811;
			return 1;
		} else {
			return 2;
		}
	}
}
