package test.weapon3.magic;

import test.weapon3.activity.AttackActivity;
import test.weapon3.activity.EquipActivity;

public enum WeaponBuffMagic implements WeaponBuffMagicVisitor{
    FLYING {
        @Override
        public void visit(EquipActivity equipActivity) {
            System.out.println("몸이 날아오릅니다.");
        }

        @Override
        public void visit(AttackActivity attackActivity) {
            System.out.println("바람과 함께 사라질지니...");
        }
    },
    LIFE_STEAL {
        @Override
        public void visit(EquipActivity equipActivity) {
            System.out.println("난 피가 부족해.");
        }

        @Override
        public void visit(AttackActivity attackActivity) {
            System.out.println("피가 굉장히 달곰한걸?!");
        }
    },
    LIGHT {
        @Override
        public void visit(EquipActivity equipActivity) {
            System.out.println("찬란한 빛과 함께하리");
        }

        @Override
        public void visit(AttackActivity attackActivity) {
            System.out.println("빛의 판결을 내리겠다.");
        }
    },
    EMPTY {
        @Override
        public void visit(EquipActivity equipActivity) {
            System.out.println("공허하다...");
        }

        @Override
        public void visit(AttackActivity attackActivity) {
            System.out.println("무소유가 소유일지니...");
        }
    };

    public static WeaponBuffMagic getDefault() {
        return EMPTY;
    }

}
