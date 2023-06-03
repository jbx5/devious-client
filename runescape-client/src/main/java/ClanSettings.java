import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("ClanSettings")
public class ClanSettings {
   @ObfuscatedName("an")
   @Export("useHashes")
   boolean useHashes;
   @ObfuscatedName("av")
   @Export("useNames")
   boolean useNames;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      longValue = 3235535219430382407L
   )
   long field1689;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1655756059
   )
   int field1699 = 0;
   @ObfuscatedName("ap")
   @Export("name")
   public String name = null;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1832361255
   )
   int field1693 = 0;
   @ObfuscatedName("ak")
   @Export("allowGuests")
   public boolean allowGuests;
   @ObfuscatedName("ae")
   public byte field1694;
   @ObfuscatedName("af")
   public byte field1695;
   @ObfuscatedName("ao")
   public byte field1709;
   @ObfuscatedName("aa")
   public byte field1697;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 66662065
   )
   @Export("memberCount")
   public int memberCount;
   @ObfuscatedName("ad")
   @Export("memberHashes")
   long[] memberHashes;
   @ObfuscatedName("ac")
   @Export("memberRanks")
   public byte[] memberRanks;
   @ObfuscatedName("ag")
   @Export("sortedMembers")
   int[] sortedMembers;
   @ObfuscatedName("ar")
   int[] field1702;
   @ObfuscatedName("ah")
   public int[] field1703;
   @ObfuscatedName("az")
   public boolean[] field1704;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 802007637
   )
   @Export("currentOwner")
   public int currentOwner = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 2051015585
   )
   public int field1706 = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -613861807
   )
   @Export("bannedMemberCount")
   public int bannedMemberCount;
   @ObfuscatedName("aw")
   @Export("bannedMemberHashes")
   long[] bannedMemberHashes;
   @ObfuscatedName("ay")
   @Export("memberNames")
   public String[] memberNames;
   @ObfuscatedName("al")
   @Export("bannedMemberNames")
   public String[] bannedMemberNames;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lsv;"
   )
   @Export("parameters")
   IterableNodeHashTable parameters;

   @ObfuscatedSignature(
      descriptor = "(Ltz;)V"
   )
   public ClanSettings(Buffer var1) {
      this.method3254(var1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "71230525"
   )
   void method3201(int var1) {
      if (this.useHashes) {
         if (this.memberHashes != null) {
            System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
         } else {
            this.memberHashes = new long[var1];
         }
      }

      if (this.useNames) {
         if (this.memberNames != null) {
            System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
         } else {
            this.memberNames = new String[var1];
         }
      }

      if (this.memberRanks != null) {
         System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount);
      } else {
         this.memberRanks = new byte[var1];
      }

      if (this.field1702 != null) {
         System.arraycopy(this.field1702, 0, this.field1702 = new int[var1], 0, this.memberCount);
      } else {
         this.field1702 = new int[var1];
      }

      if (this.field1703 != null) {
         System.arraycopy(this.field1703, 0, this.field1703 = new int[var1], 0, this.memberCount);
      } else {
         this.field1703 = new int[var1];
      }

      if (this.field1704 != null) {
         System.arraycopy(this.field1704, 0, this.field1704 = new boolean[var1], 0, this.memberCount);
      } else {
         this.field1704 = new boolean[var1];
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1091401330"
   )
   void method3268(int var1) {
      if (this.useHashes) {
         if (this.bannedMemberHashes != null) {
            System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount);
         } else {
            this.bannedMemberHashes = new long[var1];
         }
      }

      if (this.useNames) {
         if (this.bannedMemberNames != null) {
            System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
         } else {
            this.bannedMemberNames = new String[var1];
         }
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "1180582142"
   )
   public int method3200(String var1) {
      if (var1 != null && var1.length() != 0) {
         for(int var2 = 0; var2 < this.memberCount; ++var2) {
            if (this.memberNames[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IIIB)I",
      garbageValue = "0"
   )
   public int method3266(int var1, int var2, int var3) {
      int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
      return (this.field1702[var1] & var4) >>> var2;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/Integer;",
      garbageValue = "-1022568597"
   )
   @Export("getTitleGroupValue")
   public Integer getTitleGroupValue(int var1) {
      if (this.parameters == null) {
         return null;
      } else {
         Node var2 = this.parameters.get((long)var1);
         return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "-1381128788"
   )
   @Export("getSortedMembers")
   public int[] getSortedMembers() {
      if (this.sortedMembers == null) {
         String[] var1 = new String[this.memberCount];
         this.sortedMembers = new int[this.memberCount];

         for(int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) {
            var1[var2] = this.memberNames[var2];
            if (var1[var2] != null) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         int[] var3 = this.sortedMembers;
         ItemComposition.method4022(var1, var3, 0, var1.length - 1);
      }

      return this.sortedMembers;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(JLjava/lang/String;II)V",
      garbageValue = "-1898237978"
   )
   void method3207(long var1, String var3, int var4) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.useHashes) {
         throw new RuntimeException("");
      } else if (this.useNames != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
            this.method3201(this.memberCount + 5);
         }

         if (this.memberHashes != null) {
            this.memberHashes[this.memberCount] = var1;
         }

         if (this.memberNames != null) {
            this.memberNames[this.memberCount] = var3;
         }

         if (this.currentOwner == -1) {
            this.currentOwner = this.memberCount;
            this.memberRanks[this.memberCount] = 126;
         } else {
            this.memberRanks[this.memberCount] = 0;
         }

         this.field1702[this.memberCount] = 0;
         this.field1703[this.memberCount] = var4;
         this.field1704[this.memberCount] = false;
         ++this.memberCount;
         this.sortedMembers = null;
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1019322995"
   )
   void method3208(int var1) {
      if (var1 >= 0 && var1 < this.memberCount) {
         --this.memberCount;
         this.sortedMembers = null;
         if (this.memberCount == 0) {
            this.memberHashes = null;
            this.memberNames = null;
            this.memberRanks = null;
            this.field1702 = null;
            this.field1703 = null;
            this.field1704 = null;
            this.currentOwner = -1;
            this.field1706 = -1;
         } else {
            System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
            System.arraycopy(this.field1702, var1 + 1, this.field1702, var1, this.memberCount - var1);
            System.arraycopy(this.field1703, var1 + 1, this.field1703, var1, this.memberCount - var1);
            System.arraycopy(this.field1704, var1 + 1, this.field1704, var1, this.memberCount - var1);
            if (this.memberHashes != null) {
               System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
            }

            if (this.memberNames != null) {
               System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
            }

            this.updateOwner();
         }

      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1955875345"
   )
   @Export("updateOwner")
   void updateOwner() {
      if (this.memberCount == 0) {
         this.currentOwner = -1;
         this.field1706 = -1;
      } else {
         this.currentOwner = -1;
         this.field1706 = -1;
         int var1 = 0;
         byte var2 = this.memberRanks[0];

         for(int var3 = 1; var3 < this.memberCount; ++var3) {
            if (this.memberRanks[var3] > var2) {
               if (var2 == 125) {
                  this.field1706 = var1;
               }

               var1 = var3;
               var2 = this.memberRanks[var3];
            } else if (this.field1706 == -1 && this.memberRanks[var3] == 125) {
               this.field1706 = var3;
            }
         }

         this.currentOwner = var1;
         if (this.currentOwner != -1) {
            this.memberRanks[this.currentOwner] = 126;
         }

      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(JLjava/lang/String;I)V",
      garbageValue = "-518978065"
   )
   void method3210(long var1, String var3) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.useHashes) {
         throw new RuntimeException("");
      } else if (var3 != null != this.useNames) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
            this.method3268(this.bannedMemberCount + 5);
         }

         if (this.bannedMemberHashes != null) {
            this.bannedMemberHashes[this.bannedMemberCount] = var1;
         }

         if (this.bannedMemberNames != null) {
            this.bannedMemberNames[this.bannedMemberCount] = var3;
         }

         ++this.bannedMemberCount;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1055979228"
   )
   void method3211(int var1) {
      --this.bannedMemberCount;
      if (this.bannedMemberCount == 0) {
         this.bannedMemberHashes = null;
         this.bannedMemberNames = null;
      } else {
         if (this.bannedMemberHashes != null) {
            System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
         }

         if (this.bannedMemberNames != null) {
            System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1);
         }
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IBI)I",
      garbageValue = "1957427483"
   )
   int method3212(int var1, byte var2) {
      if (var2 != 126 && var2 != 127) {
         if (this.currentOwner == var1 && (this.field1706 == -1 || this.memberRanks[this.field1706] < 125)) {
            return -1;
         } else if (this.memberRanks[var1] == var2) {
            return -1;
         } else {
            this.memberRanks[var1] = var2;
            this.updateOwner();
            return var1;
         }
      } else {
         return -1;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1880737995"
   )
   boolean method3224(int var1) {
      if (this.currentOwner != var1 && this.memberRanks[var1] != 126) {
         this.memberRanks[this.currentOwner] = 125;
         this.field1706 = this.currentOwner;
         this.memberRanks[var1] = 126;
         this.currentOwner = var1;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(IZI)I",
      garbageValue = "-676569440"
   )
   int method3214(int var1, boolean var2) {
      if (this.field1704[var1] == var2) {
         return -1;
      } else {
         this.field1704[var1] = var2;
         return var1;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)I",
      garbageValue = "-90"
   )
   int method3215(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      int var8 = this.field1702[var1];
      if ((var8 & var7) == var2) {
         return -1;
      } else {
         var8 &= ~var7;
         this.field1702[var1] = var8 | var2;
         return var1;
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "78"
   )
   boolean method3203(int var1, int var2) {
      if (this.parameters != null) {
         Node var3 = this.parameters.get((long)var1);
         if (var3 != null) {
            if (var3 instanceof IntegerNode) {
               IntegerNode var4 = (IntegerNode)var3;
               if (var2 == var4.integer) {
                  return false;
               }

               var4.integer = var2;
               return true;
            }

            var3.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put(new IntegerNode(var2), (long)var1);
      return true;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)Z",
      garbageValue = "-71"
   )
   boolean method3217(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (this.parameters != null) {
         Node var8 = this.parameters.get((long)var1);
         if (var8 != null) {
            if (var8 instanceof IntegerNode) {
               IntegerNode var9 = (IntegerNode)var8;
               if ((var9.integer & var7) == var2) {
                  return false;
               }

               var9.integer &= ~var7;
               var9.integer |= var2;
               return true;
            }

            var8.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put(new IntegerNode(var2), (long)var1);
      return true;
   }

   @ObfuscatedName("ah")
   boolean method3264(int var1, long var2) {
      if (this.parameters != null) {
         Node var4 = this.parameters.get((long)var1);
         if (var4 != null) {
            if (var4 instanceof class458) {
               class458 var5 = (class458)var4;
               if (var2 == var5.field4752) {
                  return false;
               }

               var5.field4752 = var2;
               return true;
            }

            var4.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put(new class458(var2), (long)var1);
      return true;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;B)Z",
      garbageValue = "-18"
   )
   boolean method3219(int var1, String var2) {
      if (var2 == null) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (this.parameters != null) {
         Node var3 = this.parameters.get((long)var1);
         if (var3 != null) {
            if (var3 instanceof ObjectNode) {
               ObjectNode var4 = (ObjectNode)var3;
               if (var4.obj instanceof String) {
                  if (var2.equals(var4.obj)) {
                     return false;
                  }

                  var4.remove();
                  this.parameters.put(new ObjectNode(var2), var4.key);
                  return true;
               }
            }

            var3.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put(new ObjectNode(var2), (long)var1);
      return true;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "-934182859"
   )
   void method3254(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.readUnsignedByte();
         if ((var3 & 1) != 0) {
            this.useHashes = true;
         }

         if ((var3 & 2) != 0) {
            this.useNames = true;
         }

         if (!this.useHashes) {
            this.memberHashes = null;
            this.bannedMemberHashes = null;
         }

         if (!this.useNames) {
            this.memberNames = null;
            this.bannedMemberNames = null;
         }

         this.field1699 = var1.readInt();
         this.field1693 = var1.readInt();
         if (var2 <= 3 && this.field1693 != 0) {
            this.field1693 += 16912800;
         }

         this.memberCount = var1.readUnsignedShort();
         this.bannedMemberCount = var1.readUnsignedByte();
         this.name = var1.readStringCp1252NullTerminated();
         if (var2 >= 4) {
            var1.readInt();
         }

         this.allowGuests = var1.readUnsignedByte() == 1;
         this.field1694 = var1.readByte();
         this.field1695 = var1.readByte();
         this.field1709 = var1.readByte();
         this.field1697 = var1.readByte();
         int var4;
         if (this.memberCount > 0) {
            if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) {
               this.memberHashes = new long[this.memberCount];
            }

            if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) {
               this.memberNames = new String[this.memberCount];
            }

            if (this.memberRanks == null || this.memberRanks.length < this.memberCount) {
               this.memberRanks = new byte[this.memberCount];
            }

            if (this.field1702 == null || this.field1702.length < this.memberCount) {
               this.field1702 = new int[this.memberCount];
            }

            if (this.field1703 == null || this.field1703.length < this.memberCount) {
               this.field1703 = new int[this.memberCount];
            }

            if (this.field1704 == null || this.field1704.length < this.memberCount) {
               this.field1704 = new boolean[this.memberCount];
            }

            for(var4 = 0; var4 < this.memberCount; ++var4) {
               if (this.useHashes) {
                  this.memberHashes[var4] = var1.readLong();
               }

               if (this.useNames) {
                  this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
               }

               this.memberRanks[var4] = var1.readByte();
               if (var2 >= 2) {
                  this.field1702[var4] = var1.readInt();
               }

               if (var2 >= 5) {
                  this.field1703[var4] = var1.readUnsignedShort();
               } else {
                  this.field1703[var4] = 0;
               }

               if (var2 >= 6) {
                  this.field1704[var4] = var1.readUnsignedByte() == 1;
               } else {
                  this.field1704[var4] = false;
               }
            }

            this.updateOwner();
         }

         if (this.bannedMemberCount > 0) {
            if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) {
               this.bannedMemberHashes = new long[this.bannedMemberCount];
            }

            if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) {
               this.bannedMemberNames = new String[this.bannedMemberCount];
            }

            for(var4 = 0; var4 < this.bannedMemberCount; ++var4) {
               if (this.useHashes) {
                  this.bannedMemberHashes[var4] = var1.readLong();
               }

               if (this.useNames) {
                  this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
               }
            }
         }

         if (var2 >= 3) {
            var4 = var1.readUnsignedShort();
            if (var4 > 0) {
               this.parameters = new IterableNodeHashTable(var4 < 16 ? class128.method2970(var4) : 16);

               while(var4-- > 0) {
                  int var5 = var1.readInt();
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (var7 == 0) {
                     int var12 = var1.readInt();
                     this.parameters.put(new IntegerNode(var12), (long)var6);
                  } else if (var7 == 1) {
                     long var10 = var1.readLong();
                     this.parameters.put(new class458(var10), (long)var6);
                  } else if (var7 == 2) {
                     String var8 = var1.readStringCp1252NullTerminated();
                     this.parameters.put(new ObjectNode(var8), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltl;I)V",
      garbageValue = "-122907283"
   )
   @Export("updatePlayer")
   static final void updatePlayer(PacketBuffer var0) {
      var0.importIndex();
      int var1 = Client.localPlayerIndex;
      Player var2 = Projectile.localPlayer = Client.players[var1] = new Player();
      var2.index = var1;
      int var3 = var0.readBits(30);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.pathX[0] = var5 - class213.baseX * 64;
      var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
      var2.pathY[0] = var6 - class101.baseY * 64;
      var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
      Clock.Client_plane = var2.plane = var4;
      if (Players.field1332[var1] != null) {
         var2.read(Players.field1332[var1]);
      }

      Players.Players_count = 0;
      Players.Players_indices[++Players.Players_count - 1] = var1;
      Players.field1330[var1] = 0;
      Players.Players_emptyIdxCount = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if (var7 != var1) {
            int var8 = var0.readBits(18);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 597;
            int var11 = var8 & 597;
            Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
            Players.Players_orientations[var7] = 0;
            Players.Players_targetIndices[var7] = -1;
            Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
            Players.field1330[var7] = 0;
         }
      }

      var0.exportIndex();
   }
}
