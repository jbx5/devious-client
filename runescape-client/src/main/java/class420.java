import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class420 implements class419 {
	@ObfuscatedName("d")
	static int[][][] field4545;
	@ObfuscatedName("v")
	Map field4547;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lqf;")

	final class444 field4546;

	@ObfuscatedSignature(descriptor = 
	"(Lqf;)V")

	public class420(class444 var1) {
		this.field4546 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)I", garbageValue = 
	"1")

	public int vmethod7471(int var1) {
		if (this.field4547 != null) {
			class445 var2 = ((class445) (this.field4547.get(var1)));
			if (var2 != null) {
				return ((Integer) (var2.field4681));
			}
		}

		return ((Integer) (this.field4546.vmethod7950(var1)));
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/Object;B)V", garbageValue = 
	"-12")

	public void vmethod7464(int var1, Object var2) {
		if (this.field4547 == null) {
			this.field4547 = new HashMap();
			this.field4547.put(var1, new class445(var1, var2));
		} else {
			class445 var3 = ((class445) (this.field4547.get(var1)));
			if (var3 == null) {
				this.field4547.put(var1, new class445(var1, var2));
			} else {
				var3.field4681 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4547 == null ? Collections.emptyList().iterator() : this.field4547.values().iterator();
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)V", garbageValue = 
	"126")

	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class131.clientPreferences.method2246(!class131.clientPreferences.method2263());
			if (class131.clientPreferences.method2263()) {
				Actor.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				Actor.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class131.clientPreferences.method2302();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				ScriptFrame.worldMap.showCoord = !ScriptFrame.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class131.clientPreferences.method2234(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class131.clientPreferences.method2234(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				ClanChannelMember.method2868();
			}
		}

		PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2987, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}