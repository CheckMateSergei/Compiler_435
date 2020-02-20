package packages;

public interface Enviroment<K, V> {

	public void beginScope();
	public void endScope();
	public boolean inCurrentScope(K key);
	public void add(K key, V value);
	public V lookup(K key);

}
