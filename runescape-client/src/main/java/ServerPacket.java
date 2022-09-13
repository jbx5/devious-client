import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("jl")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT = new ServerPacket(0, 0);
	@ObfuscatedName("p")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket REBUILD_NORMAL = new ServerPacket(1, -2);
	@ObfuscatedName("f")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3073 = new ServerPacket(2, -2);
	@ObfuscatedName("n")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER = new ServerPacket(3, 2);
	@ObfuscatedName("k")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3145 = new ServerPacket(4, 2);
	@ObfuscatedName("w")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket REFLECTION_CHECKER = new ServerPacket(5, -2);
	@ObfuscatedName("s")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3077 = new ServerPacket(6, 7);
	@ObfuscatedName("q")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket SET_PRIVCHATMODE = new ServerPacket(7, 1);
	@ObfuscatedName("m")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3120 = new ServerPacket(8, 15);
	@ObfuscatedName("x")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket IF_SETSCROLLPOS = new ServerPacket(9, 6);
	@ObfuscatedName("j")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3081 = new ServerPacket(10, 4);
	@ObfuscatedName("v")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3141 = new ServerPacket(11, 4);
	@ObfuscatedName("h")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3083 = new ServerPacket(12, 1);
	@ObfuscatedName("t")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket LOGOUT_FULL = new ServerPacket(13, 0);
	@ObfuscatedName("u")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3085 = new ServerPacket(14, 7);
	@ObfuscatedName("d")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket IF_SETMODEL = new ServerPacket(15, 6);
	@ObfuscatedName("b")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3087 = new ServerPacket(16, 2);
	@ObfuscatedName("a")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket IF_MOVESUB = new ServerPacket(17, 8);
	@ObfuscatedName("l")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT = new ServerPacket(18, 2);
	@ObfuscatedName("e")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3090 = new ServerPacket(19, 14);
	@ObfuscatedName("g")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD = new ServerPacket(20, 4);
	@ObfuscatedName("y")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3092 = new ServerPacket(21, 1);
	@ObfuscatedName("i")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3093 = new ServerPacket(22, -2);
	@ObfuscatedName("r")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket EVENT_WORLDHOP = new ServerPacket(23, -1);
	@ObfuscatedName("z")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket REBUILD_REGION = new ServerPacket(24, -2);
	@ObfuscatedName("o")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket URL_OPEN = new ServerPacket(25, -2);
	@ObfuscatedName("as")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket IF_CLOSESUB = new ServerPacket(26, 4);
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3098 = new ServerPacket(27, 0);
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket LOGOUT = new ServerPacket(28, 1);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST = new ServerPacket(29, 8);
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3101 = new ServerPacket(30, 4);
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket IF_SETPOSITION = new ServerPacket(31, 8);
	@ObfuscatedName("an")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket UPDATE_STAT = new ServerPacket(32, 6);
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_2 = new ServerPacket(33, -2);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket MINIMAP_TOGGLE = new ServerPacket(34, 1);
	@ObfuscatedName("am")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN = new ServerPacket(35, 8);
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket IF_SETANGLE = new ServerPacket(36, 10);
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3153 = new ServerPacket(37, 0);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket IF_SETNPCHEAD = new ServerPacket(38, 6);
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR = new ServerPacket(39, 4);
	@ObfuscatedName("af")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3113 = new ServerPacket(40, 12);
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3175 = new ServerPacket(41, 2);
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3115 = new ServerPacket(42, -2);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3114 = new ServerPacket(43, -2);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket CAM_LOOKAT = new ServerPacket(44, 6);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket CAM_SETANGLE = new ServerPacket(45, 6);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT = new ServerPacket(46, -2);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3118 = new ServerPacket(47, -2);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket VARP_LARGE = new ServerPacket(48, 6);
	@ObfuscatedName("at")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3127 = new ServerPacket(49, 4);
	@ObfuscatedName("al")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket MESSAGE_GAME = new ServerPacket(50, -1);
	@ObfuscatedName("au")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_2 = new ServerPacket(51, -2);
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3123 = new ServerPacket(52, -1);
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(53, 2);
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3072 = new ServerPacket(54, -2);
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3126 = new ServerPacket(55, 5);
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket SET_PLAYER_OP = new ServerPacket(56, -1);
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket UPDATE_UID192 = new ServerPacket(57, 28);
	@ObfuscatedName("by")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT = new ServerPacket(58, 20);
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO = new ServerPacket(59, -2);
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3131 = new ServerPacket(60, -1);
	@ObfuscatedName("br")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT = new ServerPacket(61, -1);
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE = new ServerPacket(62, 0);
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3091 = new ServerPacket(63, -1);
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket NPC_SPOTANIM = new ServerPacket(64, 8);
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT_1 = new ServerPacket(65, -2);
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket PLAYER_SPOTANIM = new ServerPacket(66, 8);
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3138 = new ServerPacket(67, 5);
	@ObfuscatedName("be")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3139 = new ServerPacket(68, -1);
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3140 = new ServerPacket(69, 4);
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket UPDATE_INV_FULL = new ServerPacket(70, -2);
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3172 = new ServerPacket(71, 8);
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket UPDATE_IGNORELIST = new ServerPacket(72, -2);
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3144 = new ServerPacket(73, 5);
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3094 = new ServerPacket(74, 6);
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3146 = new ServerPacket(75, -2);
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL = new ServerPacket(76, -2);
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3112 = new ServerPacket(77, 5);
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket IF_SETCOLOUR = new ServerPacket(78, 6);
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3111 = new ServerPacket(79, 2);
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket HINT_ARROW = new ServerPacket(80, 6);
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3152 = new ServerPacket(81, -1);
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST = new ServerPacket(82, -2);
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT_1 = new ServerPacket(83, -2);
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3155 = new ServerPacket(84, 0);
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3156 = new ServerPacket(85, -2);
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket IF_SETHIDE = new ServerPacket(86, 5);
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket MESSAGE_PRIVATE = new ServerPacket(87, -2);
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE = new ServerPacket(88, 0);
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket PLAYER_INFO = new ServerPacket(89, -2);
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(90, -2);
	@ObfuscatedName("co")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket MIDI_SONG = new ServerPacket(91, 2);
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS = new ServerPacket(92, 2);
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3075 = new ServerPacket(93, 0);
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3154 = new ServerPacket(94, -2);
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET = new ServerPacket(95, 2);
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3167 = new ServerPacket(96, 6);
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3168 = new ServerPacket(97, 1);
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE = new ServerPacket(98, 5);
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket VARP_SMALL = new ServerPacket(99, 3);
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN = new ServerPacket(100, 6);
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket CAM_RESET = new ServerPacket(101, 0);
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3173 = new ServerPacket(102, 3);
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket IF_SETOBJECT = new ServerPacket(103, 10);
	@ObfuscatedName("db")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket PROJECTILE_SPAWN = new ServerPacket(104, 17);
	@ObfuscatedName("df")
	@ObfuscatedSignature(
			descriptor = "Ljl;"
	)
	public static final ServerPacket field3176 = new ServerPacket(105, 5);
	@ObfuscatedName("du")
	@ObfuscatedGetter(
			intValue = 418700999
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
			intValue = -779549889
	)
	@Export("length")
	public final int length;

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
			descriptor = "(Lqq;II)V",
			garbageValue = "714656743"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];

		for(int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) {
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];

						for(int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for(int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}

						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];

						for(var12 = 0; var12 < var7; ++var12) {
							var21[var12] = class21.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class21.loadClassFromDescriptor(var20);
						if (class21.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = class21.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;

						for(int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var17.length == var21.length) {
									boolean var18 = true;

									for(int var19 = 0; var19 < var21.length; ++var19) {
										if (var21[var19] != var17[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && var22 == var16.getReturnType()) {
										var2.methods[var3] = var16;
									}
								}
							}
						}

						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (class21.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class21.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}

		class33.reflectionChecks.addFirst(var2);
	}
}
