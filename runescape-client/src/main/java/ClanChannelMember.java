import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("v")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-113610011)

	@Export("world")
	public int world;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lqb;")

	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lfv;", garbageValue = 
	"111")

	public static HealthBarDefinition method2870(int var0) {
		HealthBarDefinition var1 = ((HealthBarDefinition) (HealthBarDefinition.HealthBarDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"-704026744")

	public static int method2869(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"0")

	static final void method2868() {
		if (Client.logoutTimer > 0) {
			ItemLayer.logOut();
		} else {
			Client.timer.method6562();
			Decimator.updateGameState(40);
			ModeWhere.field4073 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}