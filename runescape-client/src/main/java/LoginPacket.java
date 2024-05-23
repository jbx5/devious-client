import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fp")
@Implements("LoginPacket")
public class LoginPacket extends class147 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	public static AbstractArchive field1682;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 2791208581734828753L
	)
	long field1685;
	@ObfuscatedName("al")
	String field1683;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfu;)V"
	)
	LoginPacket(class150 var1) {
		this.this$0 = var1;
		this.field1685 = -1L;
		this.field1683 = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1738227110"
	)
	void vmethod3486(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1685 = var1.readLong();
		}

		this.field1683 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgc;B)V",
		garbageValue = "100"
	)
	void vmethod3490(ClanSettings var1) {
		var1.method3325(this.field1685, this.field1683, 0);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmj;",
		garbageValue = "901583378"
	)
	static class322[] method3218() {
		return new class322[]{class322.field3532, class322.field3537, class322.field3534, class322.field3535, class322.field3541, class322.field3539, class322.field3533, class322.field3540};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "-1172017478"
	)
	static Date method3213() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var0.setLenient(false);
		StringBuilder var1 = new StringBuilder();
		String[] var2 = Login.field960;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var4 == null) {
				AbstractWorldMapData.method5932("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var1.append(var4);
		}

		var1.append("12");
		return var0.parse(var1.toString());
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-1143420848"
	)
	static int method3219(int var0, Script var1, boolean var2) {
		Widget var3 = AsyncRestClient.widgetDefinition.method6536(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
