import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("v")
	boolean field1653;
	@ObfuscatedName("c")
	boolean field1658;
	@ObfuscatedName("i")
	@Export("members")
	public List members;
	@ObfuscatedName("f")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("b")
	@ObfuscatedGetter(longValue = 
	-6213414464527549047L)

	long field1656;
	@ObfuscatedName("n")
	@Export("name")
	public String name;
	@ObfuscatedName("s")
	public byte field1654;
	@ObfuscatedName("l")
	public byte field1659;
	static 
	{
		new BitSet(65536);
	}

	@ObfuscatedSignature(descriptor = 
	"(Lpi;)V")

	public ClanChannel(Buffer var1) {
		this.field1658 = true;
		this.name = null;
		this.method3117(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)[I", garbageValue = 
	"-75")

	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember) (this.members.get(var2))).username.method8243();
			}

			int[] var3 = this.sortedMembers;
			class433.method7605(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lec;B)V", garbageValue = 
	"6")

	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-911825702")

	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-251884744")

	public int method3119() {
		return this.members.size();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)I", garbageValue = 
	"75")

	public int method3116(String var1) {
		if (!this.field1658) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) {
				if (((ClanChannelMember) (this.members.get(var2))).username.getName().equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;S)V", garbageValue = 
	"-10005")

	void method3117(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1653 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1658 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1656 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1659 = var1.readByte();
		this.field1654 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1653) {
					var1.readLong();
				}

				if (this.field1658) {
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte();
				var6.world = var1.readUnsignedShort();
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.members.add(var5, var6);
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lbd;", garbageValue = 
	"-23")

	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = ((Script) (Script.Script_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class152.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = PcmPlayer.newScript(var2);
				Script.Script_cached.put(var1, ((long) (var0)));
				return var1;
			}
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIIII)V", garbageValue = 
	"-1683816578")

	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if ((((var2 >= 1) && (var3 >= 1)) && (var2 <= 102)) && (var3 <= 102)) {
			if (Client.isLowDetail && (var0 != class18.Client_plane)) {
				return;
			}

			long var7 = 0L;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;
			if (var1 == 0) {
				var7 = ArchiveLoader.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var7 = ArchiveLoader.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var7 = ArchiveLoader.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var7 = ArchiveLoader.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) {
				var12 = ArchiveLoader.scene.getObjectFlags(var0, var2, var3, var7);
				int var38 = FileSystem.Entity_unpackID(var7);
				int var39 = var12 & 31;
				int var40 = (var12 >> 6) & 3;
				ObjectComposition var13;
				if (var1 == 0) {
					ArchiveLoader.scene.removeBoundaryObject(var0, var2, var3);
					var13 = class146.getObjectDefinition(var38);
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].method3853(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) {
					ArchiveLoader.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					ArchiveLoader.scene.removeGameObject(var0, var2, var3);
					var13 = class146.getObjectDefinition(var38);
					if (((((var2 + var13.sizeX) > 103) || ((var3 + var13.sizeX) > 103)) || ((var2 + var13.sizeY) > 103)) || ((var3 + var13.sizeY) > 103)) {
						return;
					}

					if (var13.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) {
					ArchiveLoader.scene.removeFloorDecoration(var0, var2, var3);
					var13 = class146.getObjectDefinition(var38);
					if (var13.interactType == 1) {
						Client.collisionMaps[var0].method3847(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var12 = var0;
				if ((var0 < 3) && ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2)) {
					var12 = var0 + 1;
				}

				Scene var41 = ArchiveLoader.scene;
				CollisionMap var14 = Client.collisionMaps[var0];
				ObjectComposition var15 = class146.getObjectDefinition(var4);
				int var16;
				int var17;
				if ((var5 != 1) && (var5 != 3)) {
					var16 = var15.sizeX;
					var17 = var15.sizeY;
				} else {
					var16 = var15.sizeY;
					var17 = var15.sizeX;
				}

				int var18;
				int var19;
				if ((var16 + var2) <= 104) {
					var18 = (var16 >> 1) + var2;
					var19 = var2 + ((var16 + 1) >> 1);
				} else {
					var18 = var2;
					var19 = var2 + 1;
				}

				int var20;
				int var21;
				if ((var3 + var17) <= 104) {
					var20 = var3 + (var17 >> 1);
					var21 = var3 + ((var17 + 1) >> 1);
				} else {
					var20 = var3;
					var21 = var3 + 1;
				}

				int[][] var22 = Tiles.Tiles_heights[var12];
				int var23 = (((var22[var19][var20] + var22[var18][var20]) + var22[var18][var21]) + var22[var19][var21]) >> 2;
				int var24 = (var2 << 7) + (var16 << 6);
				int var25 = (var3 << 7) + (var17 << 6);
				long var26 = GameObject.calculateTag(var2, var3, 2, var15.int1 == 0, var4);
				int var28 = (var5 << 6) + var6;
				if (var15.int3 == 1) {
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) {
					if ((var15.animationId == (-1)) && (var15.transforms == null)) {
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
					}

					var41.newFloorDecoration(var0, var2, var3, var23, ((Renderable) (var36)), var26, var28);
					if (var15.interactType == 1) {
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if ((var6 != 10) && (var6 != 11)) {
					if (var6 >= 12) {
						if ((var15.animationId == (-1)) && (var15.transforms == null)) {
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
						}

						var41.method4882(var0, var2, var3, var23, 1, 1, ((Renderable) (var36)), 0, var26, var28);
						if (var15.interactType != 0) {
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) {
						if ((var15.animationId == (-1)) && (var15.transforms == null)) {
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
						}

						var41.newBoundaryObject(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), Tiles.field990[var5], 0, var26, var28);
						if (var15.interactType != 0) {
							var14.method3872(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) {
						if ((var15.animationId == (-1)) && (var15.transforms == null)) {
							var36 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
						}

						var41.newBoundaryObject(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), Tiles.field989[var5], 0, var26, var28);
						if (var15.interactType != 0) {
							var14.method3872(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) {
							var29 = (var5 + 1) & 3;
							Object var31;
							Object var37;
							if ((var15.animationId == (-1)) && (var15.transforms == null)) {
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25);
								var31 = var15.getModel(2, var29, var22, var24, var23, var25);
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
							}

							var41.newBoundaryObject(var0, var2, var3, var23, ((Renderable) (var37)), ((Renderable) (var31)), Tiles.field990[var5], Tiles.field990[var29], var26, var28);
							if (var15.interactType != 0) {
								var14.method3872(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) {
							if ((var15.animationId == (-1)) && (var15.transforms == null)) {
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
							}

							var41.newBoundaryObject(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), Tiles.field989[var5], 0, var26, var28);
							if (var15.interactType != 0) {
								var14.method3872(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) {
							if ((var15.animationId == (-1)) && (var15.transforms == null)) {
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
							}

							var41.method4882(var0, var2, var3, var23, 1, 1, ((Renderable) (var36)), 0, var26, var28);
							if (var15.interactType != 0) {
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) {
							if ((var15.animationId == (-1)) && (var15.transforms == null)) {
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
							}

							var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), Tiles.field990[var5], 0, 0, 0, var26, var28);
						} else {
							long var30;
							Object var32;
							if (var6 == 5) {
								var29 = 16;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (0L != var30) {
									var29 = class146.getObjectDefinition(FileSystem.Entity_unpackID(var30)).int2;
								}

								if ((var15.animationId == (-1)) && (var15.transforms == null)) {
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
								}

								var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var32)), ((Renderable) (null)), Tiles.field990[var5], 0, var29 * Tiles.field992[var5], var29 * Tiles.field993[var5], var26, var28);
							} else if (var6 == 6) {
								var29 = 8;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (0L != var30) {
									var29 = class146.getObjectDefinition(FileSystem.Entity_unpackID(var30)).int2 / 2;
								}

								if ((var15.animationId == (-1)) && (var15.transforms == null)) {
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
								}

								var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var32)), ((Renderable) (null)), 256, var5, var29 * Tiles.field997[var5], var29 * Tiles.field995[var5], var26, var28);
							} else if (var6 == 7) {
								int var35 = (var5 + 2) & 3;
								if ((var15.animationId == (-1)) && (var15.transforms == null)) {
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
								}

								var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), 256, var35, 0, 0, var26, var28);
							} else if (var6 == 8) {
								var29 = 8;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (var30 != 0L) {
									var29 = class146.getObjectDefinition(FileSystem.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = (var5 + 2) & 3;
								Object var33;
								if ((var15.animationId == (-1)) && (var15.transforms == null)) {
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
								}

								var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var32)), ((Renderable) (var33)), 256, var5, var29 * Tiles.field997[var5], var29 * Tiles.field995[var5], var26, var28);
							}
						}
					}
				} else {
					if ((var15.animationId == (-1)) && (var15.transforms == null)) {
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
					}

					if (var36 != null) {
						var41.method4882(var0, var2, var3, var23, var16, var17, ((Renderable) (var36)), var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) {
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(descriptor = 
	"(IIZB)V", garbageValue = 
	"61")

	static final void method3137(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if ((var1 >= 0) && (var1 < Client.currentClanChannels[var0].method3119())) {
				ClanChannelMember var3 = ((ClanChannelMember) (Client.currentClanChannels[var0].members.get(var1)));
				PacketBufferNode var4 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2967, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + class425.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}