import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class144 extends class143 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -109906921
	)
	int field1649;
	@ObfuscatedName("ay")
	boolean field1648;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class144(class146 var1) {
		this.this$0 = var1;
		this.field1649 = -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		this.field1649 = var1.readUnsignedShort();
		this.field1648 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3259(this.field1649, this.field1648);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "1982957469"
	)
	static void method3148(ArrayList var0, boolean var1) {
		if (!var1) {
			class306.field3398.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			MusicSong var3 = (MusicSong)var2.next();
			if (var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
				if (!var1) {
					class306.field3398.add(var3);
				}

				class306.field3396.add(var3);
			}
		}

	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)Ljava/lang/Object;",
		garbageValue = "-1359810813"
	)
	static Object method3147(class503 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5031) {
			case 0:
				return Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			case 2:
				return Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2108978122"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
