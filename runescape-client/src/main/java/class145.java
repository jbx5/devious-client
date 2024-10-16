import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class145 extends DualNode {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1130801815
	)
	static int field1669;
	@ObfuscatedName("cy")
	static String field1668;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -1614376065
	)
	static int field1666;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1191093357
	)
	int field1659;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[[Lfv;"
	)
	public class137[][] field1660;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[[Lfv;"
	)
	class137[][] field1661;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public Skeleton field1663;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2049414251
	)
	int field1662;
	@ObfuscatedName("ay")
	boolean field1664;
	@ObfuscatedName("am")
	Future field1665;
	@ObfuscatedName("at")
	List field1667;

	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;IZ)V"
	)
	class145(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1660 = null;
		this.field1661 = null;
		this.field1662 = 0;
		this.field1659 = var3;
		byte[] var5 = var1.takeFile(this.field1659 >> 16 & 65535, this.field1659 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}

		this.field1663 = new Skeleton(var8, var9);
		this.field1667 = new ArrayList();
		this.field1665 = class553.field5448.submit(new class144(this, var6, var7));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvl;IB)V",
		garbageValue = "7"
	)
	void method3509(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1662 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1661 = new class137[this.field1663.method4972().method4903()][];
		this.field1660 = new class137[this.field1663.method4971()][];
		class136[] var4 = new class136[var3];

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) {
			class138 var14 = MouseRecorder.method2573(var1.readUnsignedByte());
			var7 = var1.readShortSmart();
			var9 = var1.readUnsignedByte();
			class139 var15 = (class139)class177.findEnumerated(class544.method9948(), var9);
			if (var15 == null) {
				var15 = class139.field1641;
			}

			class137 var17 = new class137();
			var17.method3458(var1, var2);
			var4[var5] = new class136(this, var17, var14, var15, var7);
			int var12 = var14.method3473();
			class137[][] var13;
			if (var14 == class138.field1616) {
				var13 = this.field1661;
			} else {
				var13 = this.field1660;
			}

			if (var13[var7] == null) {
				var13[var7] = new class137[var12];
			}

			if (var14 == class138.field1619) {
				this.field1664 = true;
			}
		}

		var5 = var3 / field1669;
		int var6 = var3 % field1669;
		int var8 = 0;

		for (var9 = 0; var9 < field1669; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var7 == var8) {
				break;
			}

			this.field1667.add(class553.field5448.submit(new class140(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1795320228"
	)
	public boolean method3508() {
		if (this.field1665 == null && this.field1667 == null) {
			return true;
		} else {
			if (this.field1665 != null) {
				if (!this.field1665.isDone()) {
					return false;
				}

				this.field1665 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1667.size(); ++var2) {
				if (!((Future)this.field1667.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1667.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1667 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1662542495"
	)
	public int method3511() {
		return this.field1662;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-43"
	)
	public boolean method3540() {
		return this.field1664;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILfw;III)V",
		garbageValue = "1608425536"
	)
	public void method3513(int var1, class134 var2, int var3, int var4) {
		TransformationMatrix var5 = class177.method3843();
		this.method3514(var5, var3, var2, var1);
		this.method3542(var5, var3, var2, var1);
		this.method3515(var5, var3, var2, var1);
		var2.method3393(var5);
		var5.method8284();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqs;ILfw;IB)V",
		garbageValue = "-117"
	)
	void method3514(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3397(this.field1662);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1661[var2] != null) {
			class137 var9 = this.field1661[var2][0];
			class137 var10 = this.field1661[var2][1];
			class137 var11 = this.field1661[var2][2];
			if (var9 != null) {
				var6 = var9.method3445(var4);
			}

			if (var10 != null) {
				var7 = var10.method3445(var4);
			}

			if (var11 != null) {
				var8 = var11.method3445(var4);
			}
		}

		class427 var16 = AABB.method5244();
		var16.method8229(1.0F, 0.0F, 0.0F, var6);
		class427 var14 = AABB.method5244();
		var14.method8229(0.0F, 1.0F, 0.0F, var7);
		class427 var15 = AABB.method5244();
		var15.method8229(0.0F, 0.0F, 1.0F, var8);
		class427 var12 = AABB.method5244();
		var12.method8225(var15);
		var12.method8225(var16);
		var12.method8225(var14);
		TransformationMatrix var13 = class177.method3843();
		var13.method8260(var12);
		var1.method8278(var13);
		var16.method8227();
		var14.method8227();
		var15.method8227();
		var12.method8227();
		var13.method8284();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqs;ILfw;II)V",
		garbageValue = "1031033139"
	)
	void method3515(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3398(this.field1662);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1661[var2] != null) {
			class137 var9 = this.field1661[var2][3];
			class137 var10 = this.field1661[var2][4];
			class137 var11 = this.field1661[var2][5];
			if (var9 != null) {
				var6 = var9.method3445(var4);
			}

			if (var10 != null) {
				var7 = var10.method3445(var4);
			}

			if (var11 != null) {
				var8 = var11.method3445(var4);
			}
		}

		var1.field4783[12] = var6;
		var1.field4783[13] = var7;
		var1.field4783[14] = var8;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqs;ILfw;II)V",
		garbageValue = "-2080080538"
	)
	void method3542(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3406(this.field1662);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1661[var2] != null) {
			class137 var9 = this.field1661[var2][6];
			class137 var10 = this.field1661[var2][7];
			class137 var11 = this.field1661[var2][8];
			if (var9 != null) {
				var6 = var9.method3445(var4);
			}

			if (var10 != null) {
				var7 = var10.method3445(var4);
			}

			if (var11 != null) {
				var8 = var11.method3445(var4);
			}
		}

		TransformationMatrix var12 = class177.method3843();
		var12.method8256(var6, var7, var8);
		var1.method8278(var12);
		var12.method8284();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2017150453"
	)
	public static void method3530() {
		class182.field1864.clear();
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "-1"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		int var5 = var0 >>> 16;
		int var6 = var0 & 65535;
		Widget var7 = class416.widgetDefinition.getWidgetChild(var1, var2);
		if (var7 != null) {
			if (var7.onOp != null) {
				ScriptEvent var8 = new ScriptEvent();
				var8.widget = var7;
				var8.opIndex = var6;
				var8.field1103 = var5;
				var8.targetName = var4;
				var8.args = var7.onOp;
				Ignored.runScriptEvent(var8);
			}

			boolean var10 = true;
			if (var7.contentType > 0) {
				var10 = CollisionMap.method5694(var7);
			}

			if (var10) {
				if (class496.method9320(class171.getWidgetFlags(var7), var6 - 1)) {
					PacketBufferNode var9;
					if (var0 == 1) {
						var9 = class113.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 2) {
						var9 = class113.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 3) {
						var9 = class113.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 4) {
						var9 = class113.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 5) {
						var9 = class113.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 6) {
						var9 = class113.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 7) {
						var9 = class113.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 8) {
						var9 = class113.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 9) {
						var9 = class113.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 10) {
						var9 = class113.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var5 != 0) {
						var9 = class113.getPacketBufferNode(ClientPacket.IF_SUBOP, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						var9.packetBuffer.writeByte(var6);
						var9.packetBuffer.writeByte(var5 - 1);
						Client.packetWriter.addNode(var9);
					}

				}
			}
		}
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIZI)V",
		garbageValue = "760262054"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) {
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight * -1094859103;
		} else if (var0.heightAlignment == 1) {
			var0.height = (var2 - var0.rawHeight) * -1094859103;
		} else if (var0.heightAlignment == 2) {
			var0.height = (var2 * var0.rawHeight >> 14) * -1094859103;
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.field4006 * var0.height / var0.field3970;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.field3970 * var0.width / var0.field4006 * -1094859103;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) {
			var0.method7304().method7229(var0.width, var0.height);
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}
