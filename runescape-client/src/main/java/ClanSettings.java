import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("ClanSettings")
public class ClanSettings {
   @ObfuscatedName("e")
   @Export("useHashes")
   boolean useHashes;
   @ObfuscatedName("v")
   @Export("useNames")
   boolean useNames;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = -8288892168294800129L
   )
   long field1723;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -396642351
   )
   int field1746 = 0;
   @ObfuscatedName("q")
   @Export("name")
   public String name = null;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 257754067
   )
   int field1726 = 0;
   @ObfuscatedName("r")
   @Export("allowGuests")
   public boolean allowGuests;
   @ObfuscatedName("u")
   public byte field1728;
   @ObfuscatedName("b")
   public byte field1729;
   @ObfuscatedName("j")
   public byte field1734;
   @ObfuscatedName("g")
   public byte field1731;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -656738779
   )
   @Export("memberCount")
   public int memberCount;
   @ObfuscatedName("o")
   @Export("memberHashes")
   long[] memberHashes;
   @ObfuscatedName("n")
   @Export("memberRanks")
   public byte[] memberRanks;
   @ObfuscatedName("k")
   @Export("sortedMembers")
   int[] sortedMembers;
   @ObfuscatedName("a")
   int[] field1736;
   @ObfuscatedName("s")
   public int[] field1720;
   @ObfuscatedName("l")
   public boolean[] field1724;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -494521313
   )
   @Export("currentOwner")
   public int currentOwner = -1;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -357116423
   )
   public int field1740 = -1;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1174627911
   )
   @Export("bannedMemberCount")
   public int bannedMemberCount;
   @ObfuscatedName("d")
   @Export("bannedMemberHashes")
   long[] bannedMemberHashes;
   @ObfuscatedName("y")
   @Export("memberNames")
   public String[] memberNames;
   @ObfuscatedName("z")
   @Export("bannedMemberNames")
   public String[] bannedMemberNames;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lql;"
   )
   @Export("parameters")
   IterableNodeHashTable parameters;

   @ObfuscatedSignature(
      descriptor = "(Lqy;)V"
   )
   public ClanSettings(Buffer var1) {
      this.method3183(var1);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-237052254"
   )
   void method3165(int var1) {
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

      if (this.field1736 != null) {
         System.arraycopy(this.field1736, 0, this.field1736 = new int[var1], 0, this.memberCount);
      } else {
         this.field1736 = new int[var1];
      }

      if (this.field1720 != null) {
         System.arraycopy(this.field1720, 0, this.field1720 = new int[var1], 0, this.memberCount);
      } else {
         this.field1720 = new int[var1];
      }

      if (this.field1724 != null) {
         System.arraycopy(this.field1724, 0, this.field1724 = new boolean[var1], 0, this.memberCount);
      } else {
         this.field1724 = new boolean[var1];
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1493559455"
   )
   void method3166(int var1) {
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-1561916339"
   )
   public int method3164(String var1) {
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIIB)I",
      garbageValue = "43"
   )
   public int method3167(int var1, int var2, int var3) {
      int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
      return (this.field1736[var1] & var4) >>> var2;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/Integer;",
      garbageValue = "-58327923"
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

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "-32279624"
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

         ItemContainer.method2237(var1, this.sortedMembers);
      }

      return this.sortedMembers;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(JLjava/lang/String;II)V",
      garbageValue = "-1774968404"
   )
   void method3210(long var1, String var3, int var4) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.useHashes) {
         throw new RuntimeException("");
      } else if (this.useNames != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
            this.method3165(this.memberCount + 5);
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

         this.field1736[this.memberCount] = 0;
         this.field1720[this.memberCount] = var4;
         this.field1724[this.memberCount] = false;
         ++this.memberCount;
         this.sortedMembers = null;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1428128879"
   )
   void method3171(int var1) {
      if (var1 >= 0 && var1 < this.memberCount) {
         --this.memberCount;
         this.sortedMembers = null;
         if (this.memberCount == 0) {
            this.memberHashes = null;
            this.memberNames = null;
            this.memberRanks = null;
            this.field1736 = null;
            this.field1720 = null;
            this.field1724 = null;
            this.currentOwner = -1;
            this.field1740 = -1;
         } else {
            System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
            System.arraycopy(this.field1736, var1 + 1, this.field1736, var1, this.memberCount - var1);
            System.arraycopy(this.field1720, var1 + 1, this.field1720, var1, this.memberCount - var1);
            System.arraycopy(this.field1724, var1 + 1, this.field1724, var1, this.memberCount - var1);
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

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "54"
   )
   @Export("updateOwner")
   void updateOwner() {
      if (this.memberCount == 0) {
         this.currentOwner = -1;
         this.field1740 = -1;
      } else {
         this.currentOwner = -1;
         this.field1740 = -1;
         int var1 = 0;
         byte var2 = this.memberRanks[0];

         for(int var3 = 1; var3 < this.memberCount; ++var3) {
            if (this.memberRanks[var3] > var2) {
               if (var2 == 125) {
                  this.field1740 = var1;
               }

               var1 = var3;
               var2 = this.memberRanks[var3];
            } else if (this.field1740 == -1 && this.memberRanks[var3] == 125) {
               this.field1740 = var3;
            }
         }

         this.currentOwner = var1;
         if (this.currentOwner != -1) {
            this.memberRanks[this.currentOwner] = 126;
         }

      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(JLjava/lang/String;I)V",
      garbageValue = "-1630635224"
   )
   void method3174(long var1, String var3) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.useHashes) {
         throw new RuntimeException("");
      } else if (this.useNames != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
            this.method3166(this.bannedMemberCount + 5);
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

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "176234540"
   )
   void method3189(int var1) {
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

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(IBI)I",
      garbageValue = "-1719861457"
   )
   int method3175(int var1, byte var2) {
      if (var2 != 126 && var2 != 127) {
         if (this.currentOwner == var1 && (this.field1740 == -1 || this.memberRanks[this.field1740] < 125)) {
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

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-102"
   )
   boolean method3176(int var1) {
      if (this.currentOwner != var1 && this.memberRanks[var1] != 126) {
         this.memberRanks[this.currentOwner] = 125;
         this.field1740 = this.currentOwner;
         this.memberRanks[var1] = 126;
         this.currentOwner = var1;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(IZB)I",
      garbageValue = "76"
   )
   int method3188(int var1, boolean var2) {
      if (this.field1724[var1] == var2) {
         return -1;
      } else {
         this.field1724[var1] = var2;
         return var1;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)I",
      garbageValue = "63"
   )
   int method3178(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      int var8 = this.field1736[var1];
      if ((var8 & var7) == var2) {
         return -1;
      } else {
         var8 &= ~var7;
         this.field1736[var1] = var8 | var2;
         return var1;
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-592065337"
   )
   boolean method3179(int var1, int var2) {
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

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IIIII)Z",
      garbageValue = "1655711911"
   )
   boolean method3180(int var1, int var2, int var3, int var4) {
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

   @ObfuscatedName("s")
   boolean method3181(int var1, long var2) {
      if (this.parameters != null) {
         Node var4 = this.parameters.get((long)var1);
         if (var4 != null) {
            if (var4 instanceof class430) {
               class430 var5 = (class430)var4;
               if (var2 == var5.field4681) {
                  return false;
               }

               var5.field4681 = var2;
               return true;
            }

            var4.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put(new class430(var2), (long)var1);
      return true;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;B)Z",
      garbageValue = "0"
   )
   boolean method3182(int var1, String var2) {
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

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "638882265"
   )
   void method3183(Buffer var1) {
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

         this.field1746 = var1.readInt();
         this.field1726 = var1.readInt();
         if (var2 <= 3 && this.field1726 != 0) {
            this.field1726 += 16912800;
         }

         this.memberCount = var1.readUnsignedShort();
         this.bannedMemberCount = var1.readUnsignedByte();
         this.name = var1.readStringCp1252NullTerminated();
         if (var2 >= 4) {
            var1.readInt();
         }

         this.allowGuests = var1.readUnsignedByte() == 1;
         this.field1728 = var1.readByte();
         this.field1729 = var1.readByte();
         this.field1734 = var1.readByte();
         this.field1731 = var1.readByte();
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

            if (this.field1736 == null || this.field1736.length < this.memberCount) {
               this.field1736 = new int[this.memberCount];
            }

            if (this.field1720 == null || this.field1720.length < this.memberCount) {
               this.field1720 = new int[this.memberCount];
            }

            if (this.field1724 == null || this.field1724.length < this.memberCount) {
               this.field1724 = new boolean[this.memberCount];
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
                  this.field1736[var4] = var1.readInt();
               }

               if (var2 >= 5) {
                  this.field1720[var4] = var1.readUnsignedShort();
               } else {
                  this.field1720[var4] = 0;
               }

               if (var2 >= 6) {
                  this.field1724[var4] = var1.readUnsignedByte() == 1;
               } else {
                  this.field1724[var4] = false;
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
               this.parameters = new IterableNodeHashTable(var4 < 16 ? AccessFile.method8302(var4) : 16);

               while(var4-- > 0) {
                  int var5 = var1.readInt();
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (var7 == 0) {
                     int var12 = var1.readInt();
                     this.parameters.put(new IntegerNode(var12), (long)var6);
                  } else if (var7 == 1) {
                     long var10 = var1.readLong();
                     this.parameters.put(new class430(var10), (long)var6);
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

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)Lgq;",
      garbageValue = "1606755457"
   )
   @Export("SpotAnimationDefinition_get")
   public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
      SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
         var1 = new SpotAnimationDefinition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
