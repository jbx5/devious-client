import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("by")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("bf")
	@ObfuscatedGetter(intValue = 153118227)
	static int field950;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1810979149)
	@Export("id")
	int id;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1665661611)
	@Export("plane")
	int plane;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 105962367)
	@Export("sourceX")
	int sourceX;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -1970661863)
	@Export("sourceY")
	int sourceY;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -306056339)
	@Export("sourceZ")
	int sourceZ;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -200216133)
	@Export("endHeight")
	int endHeight;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -841508573)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1627558581)
	@Export("cycleEnd")
	int cycleEnd;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1009125805)
	@Export("slope")
	int slope;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1309967939)
	@Export("startHeight")
	int startHeight;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 1040117169)
	@Export("targetIndex")
	int targetIndex;

	@ObfuscatedName("n")
	@Export("isMoving")
	boolean isMoving = false;

	@ObfuscatedName("x")
	@Export("x")
	double x;

	@ObfuscatedName("g")
	@Export("y")
	double y;

	@ObfuscatedName("p")
	@Export("z")
	double z;

	@ObfuscatedName("b")
	@Export("speedX")
	double speedX;

	@ObfuscatedName("l")
	@Export("speedY")
	double speedY;

	@ObfuscatedName("y")
	@Export("speed")
	double speed;

	@ObfuscatedName("k")
	@Export("speedZ")
	double speedZ;

	@ObfuscatedName("v")
	@Export("accelerationZ")
	double accelerationZ;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = -2064407807)
	@Export("yaw")
	int yaw;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1115887141)
	@Export("pitch")
	int pitch;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lgc;")
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -1746247029)
	@Export("frame")
	int frame = 0;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 1355003211)
	@Export("frameCycle")
	int frameCycle = 0;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = class13.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = class14.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "24")
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = ((double) (var1 - this.sourceX));
			double var7 = ((double) (var2 - this.sourceY));
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = ((double) (this.startHeight)) * var5 / var9 + ((double) (this.sourceX));
			this.y = ((double) (this.sourceY)) + ((double) (this.startHeight)) * var7 / var9;
			this.z = ((double) (this.sourceZ));
		}
		var5 = ((double) (this.cycleEnd + 1 - var4));
		this.speedX = (((double) (var1)) - this.x) / var5;
		this.speedY = (((double) (var2)) - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(((double) (this.slope)) * 0.02454369);
		}
		this.accelerationZ = (((double) (var3)) - this.z - this.speedZ * var5) * 2.0 / (var5 * var5);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Lhd;", garbageValue = "-842208187")
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class13.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1090995262")
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * ((double) (var1));
		this.y += this.speedY * ((double) (var1));
		this.z += this.speedZ * ((double) (var1)) + 0.5 * this.accelerationZ * ((double) (var1)) * ((double) (var1));
		this.speedZ += ((double) (var1)) * this.accelerationZ;
		this.yaw = ((int) (Math.atan2(this.speedX, this.speedY) * 325.949)) + 1024 & 2047;
		this.pitch = ((int) (Math.atan2(this.speedZ, this.speed) * 325.949)) & 2047;
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frameCycle += var1;
				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
								return;
							}
							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while (this.frame < this.sequenceDefinition.frameIds.length );
						this.frame -= this.sequenceDefinition.frameCount;
					} while (this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length );
					this.frame = 0;
				} 
			} else {
				this.frame += var1;
				int var2 = this.sequenceDefinition.method3812();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V", garbageValue = "-52657202")
	static void method2008(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, class162.loginType);
		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != class28.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = class433.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteSub(0);
					var8.packetBuffer.writeShortAdd(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = class433.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAdd(var3[var6]);
					var8.packetBuffer.writeByteSub(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = class433.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteAdd(0);
					var8.packetBuffer.writeShortAdd(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = class433.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(0);
					var8.packetBuffer.writeShortAddLE(var3[var6]);
					Client.packetWriter.addNode(var8);
				}
				var4 = true;
				break;
			}
		}
		if (!var4) {
			FileSystem.addGameMessage(4, "", "Unable to find " + var1);
		}
	}
}