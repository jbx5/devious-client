import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class153 extends class163 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1128650951
	)
	int field1728;
	@ObfuscatedName("al")
	byte field1729;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1845299605
	)
	int field1730;
	@ObfuscatedName("az")
	String field1731;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	final class164 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgx;)V"
	)
	class153(class164 var1) {
		this.this$0 = var1;
		this.field1728 = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-406894472"
	)
	void vmethod3479(Buffer var1) {
		this.field1728 = var1.readUnsignedShort();
		this.field1729 = var1.readByte();
		this.field1730 = var1.readUnsignedShort();
		var1.readLong();
		this.field1731 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V",
		garbageValue = "-472458599"
	)
	void vmethod3480(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1728);
		var2.rank = this.field1729;
		var2.world = this.field1730;
		var2.username = new Username(this.field1731);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1822669547"
	)
	static String method3282() {
		String var0;
		if (class459.clientPreferences.isUsernameHidden()) {
			String var2 = Login.Login_username;
			String var1 = ItemLayer.method4585('*', var2.length());
			var0 = var1;
		} else {
			var0 = Login.Login_username;
		}

		return var0;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)Ljava/lang/Object;",
		garbageValue = "-949314910"
	)
	static Object method3285(class533 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5265) {
			case 0:
				return Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
			case 2:
				return Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}
}
