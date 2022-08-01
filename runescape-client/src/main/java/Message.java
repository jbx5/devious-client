import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("bd")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("hq")
	@ObfuscatedGetter(intValue = -829304695)
	@Export("baseY")
	static int baseY;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1158913703)
	@Export("count")
	int count;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1040379767)
	@Export("cycle")
	int cycle;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 2053279727)
	@Export("type")
	int type;

	@ObfuscatedName("u")
	@Export("sender")
	String sender;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lqi;")
	@Export("senderUsername")
	Username senderUsername;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lnm;")
	@Export("isFromFriend0")
	TriBool isFromFriend0;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lnm;")
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;

	@ObfuscatedName("j")
	@Export("prefix")
	String prefix;

	@ObfuscatedName("h")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V", garbageValue = "32")
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		int var5 = ++Messages.Messages_count - 1;
		this.count = var5;
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1504426889")
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-35")
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}
		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1216553895")
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = (MusicPatchPcmStream.friendSystem.friendsList.contains(this.senderUsername)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "12")
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-282824402")
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}
		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1205982629")
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = (MusicPatchPcmStream.friendSystem.ignoreList.contains(this.senderUsername)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-145006235")
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class20.method293(this.sender), class162.loginType);
		} else {
			this.senderUsername = null;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)Lbc;", garbageValue = "92669484")
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = ((Script) (Script.Script_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class117.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = class282.newScript(var2);
				Script.Script_cached.put(var1, ((long) (var0)));
				return var1;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1896338299")
	public static void method1062() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "-189073763")
	static int method1084(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = MouseRecorder.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class67.setWindowedMode(var3);
				}
				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class260.clientPreferences.method2387();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--TaskHandler.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5311) {
					TaskHandler.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 5312) {
					--TaskHandler.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2;
					--TaskHandler.Interpreter_intStackSize;
					return 1;
				} else {
					return var0 == 5351 ? 1 : 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class260.clientPreferences.method2334(var3);
				}
				return 1;
			}
		}
	}
}