import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("ClanChannel")
public class ClanChannel extends Node {
   @ObfuscatedName("fy")
   @ObfuscatedGetter(
      intValue = 1655091029
   )
   @Export("worldPort")
   static int worldPort;
   @ObfuscatedName("jw")
   @ObfuscatedGetter(
      intValue = 2009090259
   )
   @Export("cameraZ")
   static int cameraZ;
   @ObfuscatedName("h")
   boolean field1801;
   @ObfuscatedName("e")
   boolean field1791 = true;
   @ObfuscatedName("v")
   @Export("members")
   public List members;
   @ObfuscatedName("x")
   @Export("sortedMembers")
   int[] sortedMembers;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = -3180460269199447763L
   )
   long field1794;
   @ObfuscatedName("q")
   @Export("name")
   public String name = null;
   @ObfuscatedName("f")
   public byte field1796;
   @ObfuscatedName("r")
   public byte field1799;

   static {
      new BitSet(65536);
   }

   @ObfuscatedSignature(
      descriptor = "(Lqy;)V"
   )
   public ClanChannel(Buffer var1) {
      this.method3314(var1);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "-1521514395"
   )
   @Export("getSortedMembers")
   public int[] getSortedMembers() {
      if (this.sortedMembers == null) {
         String[] var1 = new String[this.members.size()];
         this.sortedMembers = new int[this.members.size()];

         for(int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
            var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9160();
         }

         ItemContainer.method2237(var1, this.sortedMembers);
      }

      return this.sortedMembers;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lee;I)V",
      garbageValue = "-2049218043"
   )
   @Export("addMember")
   void addMember(ClanChannelMember var1) {
      this.members.add(var1);
      this.sortedMembers = null;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1798196264"
   )
   @Export("removeMember")
   void removeMember(int var1) {
      this.members.remove(var1);
      this.sortedMembers = null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-825544108"
   )
   public int method3312() {
      return this.members.size();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "939290136"
   )
   public int method3313(String var1) {
      if (!this.field1791) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var2 = 0; var2 < this.members.size(); ++var2) {
            if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lqy;B)V",
      garbageValue = "-112"
   )
   void method3314(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if ((var2 & 1) != 0) {
         this.field1801 = true;
      }

      if ((var2 & 2) != 0) {
         this.field1791 = true;
      }

      int var3 = 2;
      if ((var2 & 4) != 0) {
         var3 = var1.readUnsignedByte();
      }

      super.key = var1.readLong();
      this.field1794 = var1.readLong();
      this.name = var1.readStringCp1252NullTerminated();
      var1.readBoolean();
      this.field1799 = var1.readByte();
      this.field1796 = var1.readByte();
      int var4 = var1.readUnsignedShort();
      if (var4 > 0) {
         this.members = new ArrayList(var4);

         for(int var5 = 0; var5 < var4; ++var5) {
            ClanChannelMember var6 = new ClanChannelMember();
            if (this.field1801) {
               var1.readLong();
            }

            if (this.field1791) {
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
}
