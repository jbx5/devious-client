import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
@Implements("UserList")
public abstract class UserList {
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -319927385
   )
   @Export("capacity")
   final int capacity;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 205297053
   )
   @Export("size")
   int size = 0;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "[Lpb;"
   )
   @Export("array")
   User[] array;
   @ObfuscatedName("ax")
   @Export("usernamesMap")
   HashMap usernamesMap;
   @ObfuscatedName("as")
   @Export("previousUsernamesMap")
   HashMap previousUsernamesMap;
   @ObfuscatedName("ay")
   @Export("comparator")
   Comparator comparator = null;

   UserList(int var1) {
      this.capacity = var1;
      this.array = this.newTypedArray(var1);
      this.usernamesMap = new HashMap(var1 / 8);
      this.previousUsernamesMap = new HashMap(var1 / 8);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Lpb;",
      garbageValue = "1708206647"
   )
   @Export("newInstance")
   abstract User newInstance();

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IB)[Lpb;",
      garbageValue = "0"
   )
   @Export("newTypedArray")
   abstract User[] newTypedArray(int var1);

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1562289590"
   )
   @Export("clear")
   public void clear() {
      this.size = 0;
      Arrays.fill(this.array, (Object)null);
      this.usernamesMap.clear();
      this.previousUsernamesMap.clear();
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1625987847"
   )
   @Export("getSize")
   public int getSize() {
      return this.size;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1944772933"
   )
   @Export("isFull")
   public boolean isFull() {
      return this.size == this.capacity;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(Ltj;I)Z",
      garbageValue = "1934216749"
   )
   @Export("contains")
   public boolean contains(Username var1) {
      if (!var1.hasCleanName()) {
         return false;
      } else {
         return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
      }
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(Ltj;B)Lpb;",
      garbageValue = "-80"
   )
   @Export("getByUsername")
   public User getByUsername(Username var1) {
      User var2 = this.getByCurrentUsername(var1);
      return var2 != null ? var2 : this.getByPreviousUsername(var1);
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(Ltj;I)Lpb;",
      garbageValue = "-280493542"
   )
   @Export("getByCurrentUsername")
   User getByCurrentUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(Ltj;I)Lpb;",
      garbageValue = "1756289227"
   )
   @Export("getByPreviousUsername")
   User getByPreviousUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(Ltj;I)Z",
      garbageValue = "-923524787"
   )
   @Export("removeByUsername")
   public final boolean removeByUsername(Username var1) {
      User var2 = this.getByCurrentUsername(var1);
      if (var2 == null) {
         return false;
      } else {
         this.remove(var2);
         return true;
      }
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(Lpb;I)V",
      garbageValue = "2145425167"
   )
   @Export("remove")
   final void remove(User var1) {
      int var2 = this.indexOf(var1);
      if (var2 != -1) {
         this.arrayRemove(var2);
         this.mapRemove(var1);
      }
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(Ltj;I)Lpb;",
      garbageValue = "1976125966"
   )
   @Export("addLastNoPreviousUsername")
   User addLastNoPreviousUsername(Username var1) {
      return this.addLast(var1, (Username)null);
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(Ltj;Ltj;I)Lpb;",
      garbageValue = "608855243"
   )
   @Export("addLast")
   User addLast(Username var1, Username var2) {
      if (this.getByCurrentUsername(var1) != null) {
         throw new IllegalStateException();
      } else {
         User var3 = this.newInstance();
         var3.set(var1, var2);
         this.arrayAddLast(var3);
         this.mapPut(var3);
         return var3;
      }
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(II)Lpb;",
      garbageValue = "-747641006"
   )
   @Export("get")
   public final User get(int var1) {
      if (var1 >= 0 && var1 < this.size) {
         return this.array[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1648691638"
   )
   @Export("sort")
   public final void sort() {
      if (this.comparator == null) {
         Arrays.sort(this.array, 0, this.size);
      } else {
         Arrays.sort(this.array, 0, this.size, this.comparator);
      }

   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(Lpb;Ltj;Ltj;I)V",
      garbageValue = "1154106226"
   )
   @Export("changeName")
   final void changeName(User var1, Username var2, Username var3) {
      this.mapRemove(var1);
      var1.set(var2, var3);
      this.mapPut(var1);
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(Lpb;B)I",
      garbageValue = "44"
   )
   @Export("indexOf")
   final int indexOf(User var1) {
      for(int var2 = 0; var2 < this.size; ++var2) {
         if (this.array[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(Lpb;B)V",
      garbageValue = "2"
   )
   @Export("mapRemove")
   final void mapRemove(User var1) {
      if (this.usernamesMap.remove(var1.username) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.previousUsername != null) {
            this.previousUsernamesMap.remove(var1.previousUsername);
         }

      }
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(Lpb;B)V",
      garbageValue = "25"
   )
   @Export("arrayAddLast")
   final void arrayAddLast(User var1) {
      this.array[++this.size - 1] = var1;
   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(Lpb;I)V",
      garbageValue = "1737051726"
   )
   @Export("mapPut")
   final void mapPut(User var1) {
      this.usernamesMap.put(var1.username, var1);
      if (var1.previousUsername != null) {
         User var2 = (User)this.previousUsernamesMap.put(var1.previousUsername, var1);
         if (var2 != null && var2 != var1) {
            var2.previousUsername = null;
         }
      }

   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "591834838"
   )
   @Export("arrayRemove")
   final void arrayRemove(int var1) {
      --this.size;
      if (var1 < this.size) {
         System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
      }

   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1159334373"
   )
   @Export("removeComparator")
   public final void removeComparator() {
      this.comparator = null;
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;I)V",
      garbageValue = "-1915513296"
   )
   @Export("addComparator")
   public final void addComparator(Comparator var1) {
      if (this.comparator == null) {
         this.comparator = var1;
      } else if (this.comparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.comparator).addComparator(var1);
      }

   }
}
