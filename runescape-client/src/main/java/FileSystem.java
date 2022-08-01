import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Hashtable;
import net.runelite.mapping.Implements;
import java.io.File;
import net.runelite.mapping.Export;
@Deprecated
@ObfuscatedName("fv")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("o")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions = false;

	@ObfuscatedName("q")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;

	@ObfuscatedName("f")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles = new Hashtable(16);

	@ObfuscatedName("hh")
	@Export("regions")
	static int[] regions;

	@ObfuscatedName("jo")
	@ObfuscatedGetter(intValue = -86846755)
	static int field1753;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", garbageValue = "-1137884034")
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		Interpreter.addChatMessage(var0, var1, var2, ((String) (null)));
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "2116620804")
	static int method3276(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class122.method2853(var0, var1, var2);
		} else if (var0 < 1100) {
			return class361.method6591(var0, var1, var2);
		} else if (var0 < 1200) {
			return SceneTilePaint.method4490(var0, var1, var2);
		} else if (var0 < 1300) {
			return WorldMapRectangle.method4964(var0, var1, var2);
		} else if (var0 < 1400) {
			return class291.method5563(var0, var1, var2);
		} else if (var0 < 1500) {
			return class268.method5214(var0, var1, var2);
		} else if (var0 < 1600) {
			return VarpDefinition.method3351(var0, var1, var2);
		} else if (var0 < 1700) {
			return TaskHandler.method3253(var0, var1, var2);
		} else if (var0 < 1800) {
			return WorldMapData_1.method4832(var0, var1, var2);
		} else if (var0 < 1900) {
			return DirectByteArrayCopier.method5520(var0, var1, var2);
		} else if (var0 < 2000) {
			return LoginScreenAnimation.method2307(var0, var1, var2);
		} else if (var0 < 2100) {
			return class361.method6591(var0, var1, var2);
		} else if (var0 < 2200) {
			return SceneTilePaint.method4490(var0, var1, var2);
		} else if (var0 < 2300) {
			return WorldMapRectangle.method4964(var0, var1, var2);
		} else if (var0 < 2400) {
			return class291.method5563(var0, var1, var2);
		} else if (var0 < 2500) {
			return class268.method5214(var0, var1, var2);
		} else if (var0 < 2600) {
			return GameEngine.method562(var0, var1, var2);
		} else if (var0 < 2700) {
			return ClanSettings.method2978(var0, var1, var2);
		} else if (var0 < 2800) {
			return BufferedNetSocket.method6883(var0, var1, var2);
		} else if (var0 < 2900) {
			return class12.method141(var0, var1, var2);
		} else if (var0 < 3000) {
			return LoginScreenAnimation.method2307(var0, var1, var2);
		} else if (var0 < 3200) {
			return ModeWhere.method6095(var0, var1, var2);
		} else if (var0 < 3300) {
			return class361.method6588(var0, var1, var2);
		} else if (var0 < 3400) {
			return ApproximateRouteStrategy.method1093(var0, var1, var2);
		} else if (var0 < 3500) {
			return class117.method2793(var0, var1, var2);
		} else if (var0 < 3600) {
			return ClanChannelMember.method2907(var0, var1, var2);
		} else if (var0 < 3700) {
			return ItemContainer.method2144(var0, var1, var2);
		} else if (var0 < 3800) {
			return Calendar.method5511(var0, var1, var2);
		} else if (var0 < 3900) {
			return SecureRandomCallable.method2120(var0, var1, var2);
		} else if (var0 < 4000) {
			return ObjectSound.method1770(var0, var1, var2);
		} else if (var0 < 4100) {
			return class122.method2852(var0, var1, var2);
		} else if (var0 < 4200) {
			return class193.method3906(var0, var1, var2);
		} else if (var0 < 4300) {
			return PacketBufferNode.method5196(var0, var1, var2);
		} else if (var0 < 5100) {
			return Login.method1996(var0, var1, var2);
		} else if (var0 < 5400) {
			return Message.method1084(var0, var1, var2);
		} else if (var0 < 5600) {
			return class7.method42(var0, var1, var2);
		} else if (var0 < 5700) {
			return ChatChannel.method2058(var0, var1, var2);
		} else if (var0 < 6300) {
			return ScriptFrame.method1056(var0, var1, var2);
		} else if (var0 < 6600) {
			return AttackOption.method2466(var0, var1, var2);
		} else if (var0 < 6700) {
			return WorldMapElement.method3356(var0, var1, var2);
		} else if (var0 < 6800) {
			return Occluder.method4311(var0, var1, var2);
		} else if (var0 < 6900) {
			return Login.method1940(var0, var1, var2);
		} else if (var0 < 7000) {
			return WorldMapLabelSize.method4539(var0, var1, var2);
		} else if (var0 < 7100) {
			return class271.method5246(var0, var1, var2);
		} else if (var0 < 7200) {
			return BuddyRankComparator.method2690(var0, var1, var2);
		} else if (var0 < 7300) {
			return class201.method4089(var0, var1, var2);
		} else if (var0 < 7500) {
			return class83.method2188(var0, var1, var2);
		} else if (var0 < 7600) {
			return DirectByteArrayCopier.method5523(var0, var1, var2);
		} else {
			return var0 < 7700 ? Login.method1999(var0, var1, var2) : 2;
		}
	}
}