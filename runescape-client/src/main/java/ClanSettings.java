import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("er")
@Implements("ClanSettings")
public class ClanSettings {
   @ObfuscatedName("f")
   @Export("useHashes")
   boolean useHashes;
   @ObfuscatedName("c")
   @Export("useNames")
   boolean useNames;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = -4089509781435719023L
   )
   long field1663;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -2140101991
   )
   int field1664 = 0;
   @ObfuscatedName("j")
   @Export("name")
   public String name = null;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1487254367
   )
   int field1666 = 0;
   @ObfuscatedName("d")
   @Export("allowGuests")
   public boolean allowGuests;
   @ObfuscatedName("n")
   public byte field1670;
   @ObfuscatedName("r")
   public byte field1660;
   @ObfuscatedName("l")
   public byte field1680;
   @ObfuscatedName("s")
   public byte field1671;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1926211067
   )
   @Export("memberCount")
   public int memberCount;
   @ObfuscatedName("b")
   @Export("memberHashes")
   long[] memberHashes;
   @ObfuscatedName("o")
   @Export("memberRanks")
   public byte[] memberRanks;
   @ObfuscatedName("u")
   @Export("sortedMembers")
   int[] sortedMembers;
   @ObfuscatedName("z")
   int[] field1668;
   @ObfuscatedName("t")
   public int[] field1677;
   @ObfuscatedName("w")
   public boolean[] field1678;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1509135395
   )
   @Export("currentOwner")
   public int currentOwner = -1;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1241325217
   )
   public int field1673 = -1;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 868971787
   )
   @Export("bannedMemberCount")
   public int bannedMemberCount;
   @ObfuscatedName("e")
   @Export("bannedMemberHashes")
   long[] bannedMemberHashes;
   @ObfuscatedName("g")
   @Export("memberNames")
   public String[] memberNames;
   @ObfuscatedName("k")
   @Export("bannedMemberNames")
   public String[] bannedMemberNames;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lpe;"
   )
   @Export("parameters")
   IterableNodeHashTable parameters;

   @ObfuscatedSignature(
      descriptor = "(Lqr;)V"
   )
   public ClanSettings(Buffer var1) {
      this.method3093(var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "46"
   )
   void method3074(int var1) {
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

      if (this.field1668 != null) {
         System.arraycopy(this.field1668, 0, this.field1668 = new int[var1], 0, this.memberCount);
      } else {
         this.field1668 = new int[var1];
      }

      if (this.field1677 != null) {
         System.arraycopy(this.field1677, 0, this.field1677 = new int[var1], 0, this.memberCount);
      } else {
         this.field1677 = new int[var1];
      }

      if (this.field1678 != null) {
         System.arraycopy(this.field1678, 0, this.field1678 = new boolean[var1], 0, this.memberCount);
      } else {
         this.field1678 = new boolean[var1];
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "478236636"
   )
   void method3075(int var1) {
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

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "56"
   )
   public int method3076(String var1) {
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
      descriptor = "(IIII)I",
      garbageValue = "1508873516"
   )
   public int method3113(int var1, int var2, int var3) {
      int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
      return (this.field1668[var1] & var4) >>> var2;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/Integer;",
      garbageValue = "2130471957"
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

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)[I",
      garbageValue = "-86"
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

         TileItem.method2554(var1, this.sortedMembers);
      }

      return this.sortedMembers;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(JLjava/lang/String;II)V",
      garbageValue = "-1585985229"
   )
   void method3080(long var1, String var3, int var4) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.useHashes) {
         throw new RuntimeException("");
      } else if (this.useNames != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
            this.method3074(this.memberCount + 5);
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

         this.field1668[this.memberCount] = 0;
         this.field1677[this.memberCount] = var4;
         this.field1678[this.memberCount] = false;
         ++this.memberCount;
         this.sortedMembers = null;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1873491787"
   )
   void method3081(int var1) {
      if (var1 >= 0 && var1 < this.memberCount) {
         --this.memberCount;
         this.sortedMembers = null;
         if (this.memberCount == 0) {
            this.memberHashes = null;
            this.memberNames = null;
            this.memberRanks = null;
            this.field1668 = null;
            this.field1677 = null;
            this.field1678 = null;
            this.currentOwner = -1;
            this.field1673 = -1;
         } else {
            System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
            System.arraycopy(this.field1668, var1 + 1, this.field1668, var1, this.memberCount - var1);
            System.arraycopy(this.field1677, var1 + 1, this.field1677, var1, this.memberCount - var1);
            System.arraycopy(this.field1678, var1 + 1, this.field1678, var1, this.memberCount - var1);
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

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "250789495"
   )
   @Export("updateOwner")
   void updateOwner() {
      if (this.memberCount == 0) {
         this.currentOwner = -1;
         this.field1673 = -1;
      } else {
         this.currentOwner = -1;
         this.field1673 = -1;
         int var1 = 0;
         byte var2 = this.memberRanks[0];

         for(int var3 = 1; var3 < this.memberCount; ++var3) {
            if (this.memberRanks[var3] > var2) {
               if (var2 == 125) {
                  this.field1673 = var1;
               }

               var1 = var3;
               var2 = this.memberRanks[var3];
            } else if (this.field1673 == -1 && this.memberRanks[var3] == 125) {
               this.field1673 = var3;
            }
         }

         this.currentOwner = var1;
         if (this.currentOwner != -1) {
            this.memberRanks[this.currentOwner] = 126;
         }

      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(JLjava/lang/String;B)V",
      garbageValue = "1"
   )
   void method3122(long var1, String var3) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (this.useHashes != var1 > 0L) {
         throw new RuntimeException("");
      } else if (this.useNames != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
            this.method3075(this.bannedMemberCount + 5);
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

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-88"
   )
   void method3084(int var1) {
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

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IBI)I",
      garbageValue = "636837268"
   )
   int method3085(int var1, byte var2) {
      if (var2 != 126 && var2 != 127) {
         if (this.currentOwner == var1 && (this.field1673 == -1 || this.memberRanks[this.field1673] < 125)) {
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

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "244076401"
   )
   boolean method3086(int var1) {
      if (this.currentOwner != var1 && this.memberRanks[var1] != 126) {
         this.memberRanks[this.currentOwner] = 125;
         this.field1673 = this.currentOwner;
         this.memberRanks[var1] = 126;
         this.currentOwner = var1;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(IZI)I",
      garbageValue = "-883299607"
   )
   int method3102(int var1, boolean var2) {
      if (this.field1678[var1] == var2) {
         return -1;
      } else {
         this.field1678[var1] = var2;
         return var1;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(IIIII)I",
      garbageValue = "1200635442"
   )
   int method3088(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      int var8 = this.field1668[var1];
      if ((var8 & var7) == var2) {
         return -1;
      } else {
         var8 &= ~var7;
         this.field1668[var1] = var8 | var2;
         return var1;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IIS)Z",
      garbageValue = "18495"
   )
   boolean method3116(int var1, int var2) {
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

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(IIIII)Z",
      garbageValue = "-22565721"
   )
   boolean method3090(int var1, int var2, int var3, int var4) {
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

   @ObfuscatedName("t")
   boolean method3091(int var1, long var2) {
      if (this.parameters != null) {
         Node var4 = this.parameters.get((long)var1);
         if (var4 != null) {
            if (var4 instanceof class427) {
               class427 var5 = (class427)var4;
               if (var2 == var5.field4632) {
                  return false;
               }

               var5.field4632 = var2;
               return true;
            }

            var4.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put(new class427(var2), (long)var1);
      return true;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Z",
      garbageValue = "814808491"
   )
   boolean method3092(int var1, String var2) {
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

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-888364959"
   )
   void method3093(Buffer var1) {
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

         this.field1664 = var1.readInt();
         this.field1666 = var1.readInt();
         if (var2 <= 3 && this.field1666 != 0) {
            this.field1666 += 16912800;
         }

         this.memberCount = var1.readUnsignedShort();
         this.bannedMemberCount = var1.readUnsignedByte();
         this.name = var1.readStringCp1252NullTerminated();
         if (var2 >= 4) {
            var1.readInt();
         }

         this.allowGuests = var1.readUnsignedByte() == 1;
         this.field1670 = var1.readByte();
         this.field1660 = var1.readByte();
         this.field1680 = var1.readByte();
         this.field1671 = var1.readByte();
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

            if (this.field1668 == null || this.field1668.length < this.memberCount) {
               this.field1668 = new int[this.memberCount];
            }

            if (this.field1677 == null || this.field1677.length < this.memberCount) {
               this.field1677 = new int[this.memberCount];
            }

            if (this.field1678 == null || this.field1678.length < this.memberCount) {
               this.field1678 = new boolean[this.memberCount];
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
                  this.field1668[var4] = var1.readInt();
               }

               if (var2 >= 5) {
                  this.field1677[var4] = var1.readUnsignedShort();
               } else {
                  this.field1677[var4] = 0;
               }

               if (var2 >= 6) {
                  this.field1678[var4] = var1.readUnsignedByte() == 1;
               } else {
                  this.field1678[var4] = false;
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
               this.parameters = new IterableNodeHashTable(var4 < 16 ? class37.method712(var4) : 16);

               while(var4-- > 0) {
                  int var5 = var1.readInt();
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (var7 == 0) {
                     int var12 = var1.readInt();
                     this.parameters.put(new IntegerNode(var12), (long)var6);
                  } else if (var7 == 1) {
                     long var10 = var1.readLong();
                     this.parameters.put(new class427(var10), (long)var6);
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

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "-26"
   )
   @Export("isAlphaNumeric")
   public static boolean isAlphaNumeric(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "2011850487"
   )
   static int method3078(int var0, Script var1, boolean var2) {
      Widget var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
      if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class167.Widget_unpackTargetMask(class197.getWidgetFlags(var3));
         return 1;
      } else if (var0 != ScriptOpcodes.IF_GETOP) {
         if (var0 == ScriptOpcodes.IF_GETOPBASE) {
            if (var3.dataText == null) {
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
            } else {
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.dataText;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         --var4;
         if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.actions[var4];
         } else {
            Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
         }

         return 1;
      }
   }
}
