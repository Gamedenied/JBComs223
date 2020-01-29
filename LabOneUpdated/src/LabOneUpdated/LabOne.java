package LabOneUpdated;

public class LabOne <E> implements List<E> {
	private Object[] data = new Object[0];

	@Override
	public boolean add(E e) {
		if (e == null)
			throw new IllegalArgumentException("null values not allowed");
		Object[] newData = new Object[data.length + 1];
		for (int i = 0; i < data.length; i++)
			newData[i] = data[i];
		newData[newData.length - 1] = e;
		data = newData;
		return true;
	}

	@Override
	public boolean remove(E e) {
		int index = -1;
		for (int i = 0; i < data.length && index == -1; i++) {
			if (data[i].equals(e))
				index = i;
		}
		if (index != -1) {
			Object[] newData = new Object[data.length - 1];
			for (int i = 0; i < index; i++)
				newData[i] = data[i];
			for (int i = index + 1; i < data.length; i++)
				newData[i - 1] = data[i];
			data = newData;
		}
		return index != -1;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}
}
}
