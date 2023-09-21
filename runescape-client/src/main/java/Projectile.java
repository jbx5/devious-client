import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dv")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1341664707
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1877059381
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 241015825
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1224861431
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -91313947
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1850280869
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -277767081
	)
	int field974;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 865913595
	)
	int field975;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1810255393
	)
	int field989;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1137484039
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1784603259
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1337603839
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1882373057
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1395531949
	)
	int field976;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1406134675
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("aj")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("an")
	@Export("x")
	double x;
	@ObfuscatedName("au")
	@Export("y")
	double y;
	@ObfuscatedName("ai")
	@Export("z")
	double z;
	@ObfuscatedName("ae")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("aw")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("aq")
	@Export("speed")
	double speed;
	@ObfuscatedName("az")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("at")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -603201469
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -951513477
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 811265973
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 2017125921
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
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
		int var12 = class406.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = class36.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field976 = var10;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "715135572"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field974 = var1;
		this.field975 = var2;
		this.field989 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field974 - this.sourceX);
			double var7 = (double)(this.field975 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = var5 * (double)this.startHeight / var9 + (double)this.sourceX;
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field974 - this.x) / var5;
		this.speedY = ((double)this.field975 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)this.field989 - this.z - var5 * this.speedZ) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljn;",
		garbageValue = "0"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class406.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-952040923"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += (double)var1 * this.speedY;
		this.z += (double)var1 * this.accelerationZ * 0.5D * (double)var1 + (double)var1 * this.speedZ;
		this.speedZ += (double)var1 * this.accelerationZ;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
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
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.frame = 0;
				}
			} else {
				this.frame += var1;
				int var2 = this.sequenceDefinition.method4177();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;ZLpu;I)V",
		garbageValue = "1662908547"
	)
	public static void method2185(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		class317.ItemDefinition_archive = var0;
		class349.ItemDefinition_modelArchive = var1;
		HealthBarUpdate.ItemDefinition_inMembersWorld = var2;
		class284.ItemDefinition_fileCount = class317.ItemDefinition_archive.getGroupFileCount(10);
		class142.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-1524962913"
	)
	static int method2187(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			Interpreter.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			Canvas.privateChatMode = UserComparator9.method2919(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			if (Canvas.privateChatMode == null) {
				Canvas.privateChatMode = PrivateChatMode.field5274;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = ClanChannelMember.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(Canvas.privateChatMode.field5271);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
				Interpreter.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var6 = ClanChannelMember.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(class478.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = SoundCache.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = WorldMapRegion.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (Canvas.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Canvas.privateChatMode.field5271;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var12 = class160.method3340(var7, var8, WorldMapLabelSize.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class180.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize + 1];
							var12 = ClanChannelMember.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							class150.method3192(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var6 = class160.method3340(var7, var8, WorldMapLabelSize.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferNameComparator.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UrlRequest.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MouseRecorder.method2336(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
								class163.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field752 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = Client.field752;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
								var5 = SoundCache.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var4 = WorldMapRegion.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (TextureProvider.localPlayer != null && TextureProvider.localPlayer.username != null) {
								var8 = TextureProvider.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1050765779"
	)
	static final void method2184(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (class365.cameraPitch < var0) {
			class365.cameraPitch = (var0 - class365.cameraPitch) * class465.field4788 / 1000 + class365.cameraPitch + class232.field2431;
			if (class365.cameraPitch > var0) {
				class365.cameraPitch = var0;
			}
		} else if (class365.cameraPitch > var0) {
			class365.cameraPitch -= (class365.cameraPitch - var0) * class465.field4788 / 1000 + class232.field2431;
			if (class365.cameraPitch < var0) {
				class365.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - WallDecoration.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			WallDecoration.cameraYaw = WallDecoration.cameraYaw + class232.field2431 + var2 * class465.field4788 / 1000;
			WallDecoration.cameraYaw &= 2047;
		} else if (var2 < 0) {
			WallDecoration.cameraYaw -= -var2 * class465.field4788 / 1000 + class232.field2431;
			WallDecoration.cameraYaw &= 2047;
		}

		int var3 = var1 - WallDecoration.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			WallDecoration.cameraYaw = var1;
		}

	}
}
