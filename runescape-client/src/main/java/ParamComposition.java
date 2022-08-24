import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("gw")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("ParamDefinition_cached")
	public static EvictingDualNodeHashTable ParamDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("w")
	@Export("type")
	char type;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1377513159)
	@Export("defaultInt")
	public int defaultInt;

	@ObfuscatedName("c")
	@Export("defaultStr")
	public String defaultStr;

	@ObfuscatedName("q")
	@Export("autoDisable")
	boolean autoDisable = true;

	ParamComposition() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "15")
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "1701434931")
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqr;II)V", garbageValue = "800980186")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.type = UrlRequest.method2530(var1.readByte());
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-2133855469")
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "118")
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Widget.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!DbRowType.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = DbRowType.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				Widget.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (class358.Widget_interfaceComponents[var0] == null) {
					class358.Widget_interfaceComponents[var0] = new Widget[var1];
				}
				for (int var2 = 0; var2 < var1; ++var2) {
					if (class358.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = DbRowType.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							class358.Widget_interfaceComponents[var0][var2] = new Widget();
							class358.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								class358.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								class358.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}
				Widget.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-927717931")
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) {
			if (KeyHandler.field139 == KeyHandler.field141) {
				return false;
			} else {
				class145.field1653 = KeyHandler.field144[KeyHandler.field139];
				BoundaryObject.field2636 = KeyHandler.field125[KeyHandler.field139];
				KeyHandler.field139 = KeyHandler.field139 + 1 & 127;
				return true;
			}
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2065757413")
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();
		while (var0.hasNext()) {
			Message var1 = ((Message) (var0.next()));
			var1.clearIsFromIgnored();
		} 
		if (class19.friendsChat != null) {
			class19.friendsChat.invalidateIgnoreds();
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1050807698")
	static final void method3508() {
		Client.field710 = Client.cycleCntr;
	}
}