import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 204397767
	)
	static int field992;
	@ObfuscatedName("jm")
	static byte[][] field995;
	@ObfuscatedName("ay")
	String field984;
	@ObfuscatedName("an")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("au")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ax")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1533504867
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1409367863
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1321038423
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 900840337
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)[Lud;",
		garbageValue = "1491057046"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "0"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					Throwable var4 = var1;
					String var5;
					if (var1 instanceof RunException) {
						RunException var6 = (RunException)var1;
						var5 = var6.message + " | ";
						var4 = var6.throwable;
					} else {
						var5 = "";
					}

					StringWriter var18 = new StringWriter();
					PrintWriter var7 = new PrintWriter(var18);
					var4.printStackTrace(var7);
					var7.close();
					String var8 = var18.toString();
					BufferedReader var9 = new BufferedReader(new StringReader(var8));
					String var10 = var9.readLine();

					label59:
					while (true) {
						while (true) {
							String var11 = var9.readLine();
							if (var11 == null) {
								var5 = var5 + "| " + var10;
								var2 = var5;
								break label59;
							}

							int var12 = var11.indexOf(40);
							int var13 = var11.indexOf(41, var12 + 1);
							if (var12 >= 0 && var13 >= 0) {
								String var14 = var11.substring(var12 + 1, var13);
								int var15 = var14.indexOf(".java:");
								if (var15 >= 0) {
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
									var5 = var5 + var14 + ' ';
									continue;
								}

								var11 = var11.substring(0, var12);
							}

							var11 = var11.trim();
							var11 = var11.substring(var11.lastIndexOf(32) + 1);
							var11 = var11.substring(var11.lastIndexOf(9) + 1);
							var5 = var5 + var11 + ' ';
						}
					}
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (class238.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(class238.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + InterfaceParent.field1059 + "&u=" + class490.field5021 + "&v1=" + class137.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.field5551 + "&e=" + var2);
				DataInputStream var17 = new DataInputStream(var3.openStream());
				var17.read();
				var17.close();
			} catch (Exception var16) {
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BI)Ldp;",
		garbageValue = "-1651235539"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? WorldMapEvent.method6096(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field984 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1035311996"
	)
	static final int method2285(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Lmf;I)V",
		garbageValue = "401134969"
	)
	static void method2289(PacketBufferNode var0) {
		var0.packetBuffer.writeInt(ReflectionCheck.archive10.hash);
		var0.packetBuffer.writeInt(FriendsChat.field4909.hash);
		var0.packetBuffer.writeIntLE(class33.archive6.hash);
		var0.packetBuffer.writeIntLE(KeyHandler.field100.hash);
		var0.packetBuffer.writeIntME(0);
		var0.packetBuffer.writeIntIME(LoginScreenAnimation.field1281.hash);
		var0.packetBuffer.writeIntME(class424.field4678.hash);
		var0.packetBuffer.writeIntME(class59.archive8.hash);
		var0.packetBuffer.writeIntLE(class167.field1796.hash);
		var0.packetBuffer.writeIntLE(ClientPreferences.archive9.hash);
		var0.packetBuffer.writeIntLE(ClientPacket.field3331.hash);
		var0.packetBuffer.writeIntLE(RestClientThreadFactory.archive12.hash);
		var0.packetBuffer.writeIntIME(class33.field152.hash);
		var0.packetBuffer.writeIntIME(Occluder.field2111.hash);
		var0.packetBuffer.writeInt(class60.archive4.hash);
		var0.packetBuffer.writeIntME(SoundSystem.archive2.hash);
		var0.packetBuffer.writeIntLE(Actor.archive13.hash);
		var0.packetBuffer.writeInt(Projectile.soundEffectsArchive.hash);
		var0.packetBuffer.writeIntME(VarbitComposition.field2680.hash);
		var0.packetBuffer.writeIntIME(WorldView.field1305.hash);
		var0.packetBuffer.writeIntIME(Tile.field1936.hash);
	}
}
